package com.uniblox.pages;

import com.uniblox.helpers.JSHelper;
import com.uniblox.helpers.VisibilityHelper;
import com.uniblox.helpers.WebElementHelper;
import com.uniblox.steps.EnrolInsuranceProductSteps;
import com.uniblox.util.PropertyReaderUtil;
import org.apache.commons.logging.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class AddressPage implements BasePage {

    private final static Logger Log = Logger.getLogger(AddressPage.class.getName());
    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//input[contains(@class,'pac-target-input')][@tabindex='1']")
    public WebElement input_address_box;

    @FindBy(xpath = "//input[@id='apt_unit'][@tabindex='2']")
    public WebElement input_apt_box;

    @FindBy(xpath = "//input[@id='option-auth'][@name='isAuthReleaseAgree']")
    public WebElement agreement_authrelease;

    @FindBy(xpath = "//input[@id='option-consent'][@name='isConsentBusiness']")
    public WebElement agreement_consent;

    public void assertonAddressPage() {
        Log.info("In welcome page");
        webElementHelper.isAt("Address"); }

    public void enterAddress() throws InterruptedException {
        PropertyReaderUtil.readProperties();
        visibilityHelper.waitForVisibilityOf(input_address_box);
        jsHelper.highlightElement(input_address_box);
        input_address_box.sendKeys(PropertyReaderUtil.auto.getProperty("address"));
        Thread.sleep(1000);
        input_address_box.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        input_address_box.sendKeys(Keys.ENTER);
    }

    public void enterApt() {
        PropertyReaderUtil.readProperties();
        visibilityHelper.waitForVisibilityOf(input_apt_box);
        jsHelper.highlightElement(input_apt_box);
        input_apt_box.sendKeys(PropertyReaderUtil.auto.getProperty("apt"));
    }

    public void clickAgreementFirstCheckBox() throws InterruptedException {
        Thread.sleep(1000);
        visibilityHelper.waitForVisibilityOf(agreement_authrelease);
        jsHelper.highlightElement(agreement_authrelease);
        agreement_authrelease.click();
    }

    public void clickAgreementSecondCheckBox() throws InterruptedException {
        Thread.sleep(1000);
        visibilityHelper.waitForVisibilityOf(agreement_consent);
        jsHelper.highlightElement(agreement_consent);
        agreement_consent.click();
    }

}
