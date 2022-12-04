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
public class PastPage implements BasePage {

    private final static Logger Log = Logger.getLogger(PastPage.class.getName());

    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//input[@name='noneOfAbove']")
    public WebElement none_of_above_checkbox;

    public void assertonPastPage() {
        Log.info("In Past page");
        webElementHelper.isAt("In the past ten years"); }

    public void clickNoneoftheAboveCheckBox() throws InterruptedException {
        Thread.sleep(1000);
        visibilityHelper.waitForVisibilityOf(none_of_above_checkbox);
        jsHelper.highlightElement(none_of_above_checkbox);
        none_of_above_checkbox.click();
    }

}
