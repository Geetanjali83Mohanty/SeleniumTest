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
public class LicensePage implements BasePage {

    private final static Logger Log = Logger.getLogger(LicensePage.class.getName());

    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//*[@id='no']")
    public WebElement radio_btn_no;
    public void assertonLicensePage() {
        Log.info("In License page");
        webElementHelper.isAt("License"); }

    public void selectRadioButton() {
        visibilityHelper.waitForVisibilityOf(radio_btn_no);
        jsHelper.highlightElement(radio_btn_no);
        radio_btn_no.click();
    }

}
