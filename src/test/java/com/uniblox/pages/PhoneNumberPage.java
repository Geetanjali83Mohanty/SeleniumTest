package com.uniblox.pages;

import com.uniblox.helpers.JSHelper;
import com.uniblox.helpers.VisibilityHelper;
import com.uniblox.helpers.WebElementHelper;
import com.uniblox.steps.EnrolInsuranceProductSteps;
import com.uniblox.util.PropertyReaderUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class PhoneNumberPage implements BasePage {

    private final static Logger Log = Logger.getLogger(PhoneNumberPage.class.getName());

    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//input[@name='answer'][@tabindex='1']")
    public WebElement inputbox_phone_number;

    public void assertonPhoneNumberPage() throws InterruptedException {
        webElementHelper.waitAndWatch(2000);
        Log.info("In Phone Number page");
        visibilityHelper.waitForVisibilityOf(inputbox_phone_number);
        webElementHelper.isAt("Phone"); }

    public void enterphoneNumber() {
        PropertyReaderUtil.readProperties();
        visibilityHelper.waitForVisibilityOf(inputbox_phone_number);
        jsHelper.highlightElement(inputbox_phone_number);
        inputbox_phone_number.sendKeys(PropertyReaderUtil.auto.getProperty("phone"));
    }
}
