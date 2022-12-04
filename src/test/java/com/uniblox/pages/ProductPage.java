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
public class ProductPage implements BasePage {

    private final static Logger Log = Logger.getLogger(ProductPage.class.getName());

    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//input[@type='checkbox'][@tabindex='2']")
    public WebElement checkBox_Supplemental_Chkbox;
    public void assertonProductPage() {
        Log.info("In Product page");
        webElementHelper.isAt("Product"); }

    public void clickSupplementalCheckBox() throws InterruptedException {
        //Thread.sleep(1000);
        visibilityHelper.waitForVisibilityOf(checkBox_Supplemental_Chkbox);
        jsHelper.highlightElement(checkBox_Supplemental_Chkbox);
        checkBox_Supplemental_Chkbox.click();
    }

}
