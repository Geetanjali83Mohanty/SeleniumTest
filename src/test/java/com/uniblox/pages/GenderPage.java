package com.uniblox.pages;

import com.uniblox.helpers.JSHelper;
import com.uniblox.helpers.VisibilityHelper;
import com.uniblox.helpers.WebElementHelper;
import com.uniblox.steps.EnrolInsuranceProductSteps;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class GenderPage implements BasePage {

    private final static Logger Log = Logger.getLogger(GenderPage.class.getName());
    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//input[@tabindex='1'][@type='radio']")
    public WebElement radio_btn_male;

    @FindBy(xpath = "//input[@name='answer'][@tabindex='1']")
    public WebElement inputbox_phone_number;

    public void assertonGenderPage() {
        Log.info("In Gender page");
        webElementHelper.isAt("Gender"); }

    public void selectRadioButton() throws InterruptedException {
        visibilityHelper.waitForVisibilityOf(radio_btn_male);
        jsHelper.highlightElement(radio_btn_male);
        radio_btn_male.click();
        visibilityHelper.waitForVisibilityOf(inputbox_phone_number);
    }
}
