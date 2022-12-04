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
public class HeightWeightPage implements BasePage {

    private final static Logger Log = Logger.getLogger(HeightWeightPage.class.getName());

    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//*[@id='height']")
    public WebElement drop_down_height;

    @FindBy(xpath = "//input[@type='text'][@name='weight']")
    public WebElement inputbox_weight;

    public void assertonheightWeightPagePage() {
        Log.info("In Height and Weight page");
        webElementHelper.isAt("Height & Weight"); }

    public void selectDropDownValue(String id, String strHeight) {
        PropertyReaderUtil.readProperties();
        visibilityHelper.waitForVisibilityOf(drop_down_height);
        jsHelper.highlightElement(drop_down_height);
        webElementHelper.selectDropdownValue(id,PropertyReaderUtil.auto.getProperty("height"));
    }

    public void enterWeight() {
        PropertyReaderUtil.readProperties();
        visibilityHelper.waitForVisibilityOf(inputbox_weight);
        jsHelper.highlightElement(inputbox_weight);
        inputbox_weight.sendKeys(PropertyReaderUtil.auto.getProperty("weight"));
    }

}
