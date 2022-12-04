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
public class DateOfBirthPage implements BasePage {

    private final static Logger Log = Logger.getLogger(DateOfBirthPage.class.getName());
    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//input[@id='date'][@type='text']")
    public WebElement inputbox_dob;


    public void assertonDateofbirthPage() {
        Log.info("In Date of Birth page");
        webElementHelper.isAt("Date of birth"); }

    public void enterdateOfBirth() {
        PropertyReaderUtil.readProperties();
        visibilityHelper.waitForVisibilityOf(inputbox_dob);
        jsHelper.highlightElement(inputbox_dob);
        inputbox_dob.sendKeys(PropertyReaderUtil.auto.getProperty("date"));
    }
}
