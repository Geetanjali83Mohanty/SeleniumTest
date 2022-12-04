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
public class EmailPage implements BasePage {

    private final static Logger Log = Logger.getLogger(EmailPage.class.getName());
    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//input[@type='text'][@tabindex='1']")
    public WebElement input_email_box;

    public void assertonEmailPage() {
        Log.info("In Email page");
        webElementHelper.isAt("Email"); }

    public void enterEmail() {
        PropertyReaderUtil.readProperties();
        visibilityHelper.waitForVisibilityOf(input_email_box);
        jsHelper.highlightElement(input_email_box);
        input_email_box.sendKeys(PropertyReaderUtil.auto.getProperty("email"));
    }
}
