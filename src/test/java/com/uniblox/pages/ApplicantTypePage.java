package com.uniblox.pages;

import com.uniblox.helpers.JSHelper;
import com.uniblox.helpers.VisibilityHelper;
import com.uniblox.helpers.WebElementHelper;
import com.uniblox.steps.EnrolInsuranceProductSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class ApplicantTypePage implements BasePage {

    private final static Logger Log = Logger.getLogger(ApplicantTypePage.class.getName());

    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//input[@tabindex='1']")
    public WebElement radio_btn_employee;

    public void assertonApplicantTypePage() {
        Log.info("In Applicant Type page");
        webElementHelper.isAt("Applicant Type"); }

    public void selectRadioButton() {
        visibilityHelper.waitForVisibilityOf(radio_btn_employee);
        jsHelper.highlightElement(radio_btn_employee);
        radio_btn_employee.click();
    }
}
