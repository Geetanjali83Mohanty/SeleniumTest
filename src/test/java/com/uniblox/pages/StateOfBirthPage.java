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
public class StateOfBirthPage implements BasePage {

    private final static Logger Log = Logger.getLogger(StateOfBirthPage.class.getName());

    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//*[@id='stateOfBirth']")
    public WebElement dropdown_stateofbirth;

    public void assertonstateOfBirthPagePage() {
        Log.info("In state Of Birth Page");
        webElementHelper.isAt("State of birth"); }

    public void selectDropDownValue(String id, String strCounty) {
        visibilityHelper.waitForVisibilityOf(dropdown_stateofbirth);
        jsHelper.highlightElement(dropdown_stateofbirth);
        webElementHelper.selectDropdownValue(id,strCounty);
    }

}
