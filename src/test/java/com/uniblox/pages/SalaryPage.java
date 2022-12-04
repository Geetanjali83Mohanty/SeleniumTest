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
public class SalaryPage implements BasePage {

    private final static Logger Log = Logger.getLogger(SalaryPage.class.getName());

    @Autowired
    private WebElementHelper webElementHelper;

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//input[@type='number'][@tabindex='1']")
    public WebElement input_salary;

    public void assertonSalaryPage() {
        Log.info("In Salary page");
        webElementHelper.isAt("Salary"); }

    public void enterSalary() {
        PropertyReaderUtil.readProperties();
        visibilityHelper.waitForVisibilityOf(input_salary);
        jsHelper.highlightElement(input_salary);
        input_salary.sendKeys(PropertyReaderUtil.auto.getProperty("salary"));
    }

}
