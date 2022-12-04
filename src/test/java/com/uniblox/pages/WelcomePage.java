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
public class WelcomePage implements BasePage {

    private final static Logger Log = Logger.getLogger(WelcomePage.class.getName());
    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement button_get_started;

    @FindBy(xpath = "//button[@type='button']/following::div[@class='mt-4']")
    public WebElement button_start_new_applicaion;


    public void assertonWelcomePage() {
        Log.info("In Welcome page");
        webElementHelper.isAt("Welcome"); }

    public void clickGetStarted() {
        visibilityHelper.waitForVisibilityOf(button_get_started);
        jsHelper.highlightElement(button_get_started);
        button_get_started.click(); }

    public void clickStartNewApplication() {
        visibilityHelper.waitForVisibilityOf(button_start_new_applicaion);
        button_start_new_applicaion.click();
    }
}
