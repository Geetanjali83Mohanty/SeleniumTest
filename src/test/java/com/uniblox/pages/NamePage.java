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
public class NamePage implements BasePage {

    private final static Logger Log = Logger.getLogger(NamePage.class.getName());

    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//input[@id='first_name'][@tabindex='1']")
    public WebElement inputbox_first_name;

    @FindBy(xpath = "//input[@id='last_name'][@tabindex='2']")
    public WebElement inputbox_last_name;

    public void assertonNamePage() {
        Log.info("In Name page");
        webElementHelper.isAt("Name"); }

    public void enterFirstName() {
        PropertyReaderUtil.readProperties();
        visibilityHelper.waitForVisibilityOf(inputbox_first_name);
        jsHelper.highlightElement(inputbox_first_name);
        inputbox_first_name.sendKeys(PropertyReaderUtil.auto.getProperty("first_name"));
    }

    public void enterLastName() {
        PropertyReaderUtil.readProperties();
        visibilityHelper.waitForVisibilityOf(inputbox_last_name);
        jsHelper.highlightElement(inputbox_last_name);
        inputbox_last_name.sendKeys(PropertyReaderUtil.auto.getProperty("last_name"));
    }

}
