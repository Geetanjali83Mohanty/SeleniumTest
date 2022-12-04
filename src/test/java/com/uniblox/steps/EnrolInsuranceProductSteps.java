package com.uniblox.steps;

import com.uniblox.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public class EnrolInsuranceProductSteps {

    private final static Logger Log = Logger.getLogger(EnrolInsuranceProductSteps.class.getName());

    @Autowired
    private WelcomePage welcomePage;

    @Autowired
    private ApplicantTypePage applicantTypePage;

    @Autowired
    private ProductPage productPage;

    @Autowired
    private NamePage namePage;

    @Autowired
    private EmailPage emailPage;

    @Autowired
    private SalaryPage salaryPage;

    @Autowired
    private GenderPage genderPage;

    @Autowired
    private DateOfBirthPage dateOfBirthPage;

    @Autowired
    private PhoneNumberPage phoneNumberPage;

    @Autowired
    private AddressPage addressPage;

    @Autowired
    private StateOfBirthPage stateOfBirthPage;

    @Autowired
    private LicensePage licensePage;

    @Autowired
    private HeightWeightPage heightWeightPage;

    @Autowired
    private PastPage pastPage;

    @Given("user in Insure Welcome Page")
    public void userInInsureWelcomePage() {
        welcomePage.assertonWelcomePage();
    }

    @Then("user landed to {string} page")
    public void userLandedToPage(String strPage) throws InterruptedException {
        switch (strPage) {

            case "Applicant Type":
                applicantTypePage.assertonApplicantTypePage();
                break;

            case "Product":
                productPage.assertonProductPage();
                break;

            case "Name":
                namePage.assertonNamePage();
                break;

            case "Email":
                emailPage.assertonEmailPage();
                break;

            case "Salary":
                salaryPage.assertonSalaryPage();
                break;

            case "Gender":
                genderPage.assertonGenderPage();
                break;

            case "Phone":
                phoneNumberPage.assertonPhoneNumberPage();
                break;

            case "Date of birth":
                dateOfBirthPage.assertonDateofbirthPage();
                break;

            case "Address":
                addressPage.assertonAddressPage();
                break;

            case "State of birth":
                stateOfBirthPage.assertonstateOfBirthPagePage();
                break;

            case "License":
                licensePage.assertonLicensePage();
                break;

            case "Height & Weight":
                heightWeightPage.assertonheightWeightPagePage();
                break;

            case "In the past 10 years":
                pastPage.assertonPastPage();
                break;

            default:
                Log.info(strPage + ":does not exist");
        }
    }

    @And("user Clicks {string} button")
    public void userClicksButton(String buttonName) {

        switch (buttonName) {

            case "Get Started":

                welcomePage.clickGetStarted();
                break;

            case "Next":
                welcomePage.clickGetStarted();
                break;

            default:
                Log.info(buttonName + ":does not exist");
        }

    }

    @When("user Selects {string} check box")
    public void userSelectsCheckBox(String strCheckBox) throws InterruptedException {
        switch (strCheckBox) {

            case "Short Term Disability":
                productPage.clickSupplementalCheckBox();
                break;

            case "Agreement1":
                addressPage.clickAgreementFirstCheckBox();
                break;

            case "Agreement2":
                addressPage.clickAgreementSecondCheckBox();
                break;

            case "None of the above":
                pastPage.clickNoneoftheAboveCheckBox();
                break;

            default:
                Log.info(strCheckBox + ":does not exist");
        }

    }

    @When("user Selects {string} radio button")
    public void userSelectsRadioButton(String radioButton) throws InterruptedException {
        switch (radioButton) {

            case "Employee":
                applicantTypePage.selectRadioButton();
                break;

            case "Male":
                genderPage.selectRadioButton();
                break;


            case "No":
                licensePage.selectRadioButton();
                break;

            default:
                Log.info(radioButton + ":does not exist");
        }
    }

    @When("user enter {string} in input box")
    public void userEnterInInputBox(String inputBoxName) throws InterruptedException {
        switch (inputBoxName) {

            case "First Name":
                namePage.enterFirstName();
                break;

            case "Last Name":
                namePage.enterLastName();
                break;

            case "Email":
                emailPage.enterEmail();
                break;

            case "Salary":
                salaryPage.enterSalary();
                break;

            case "Date of Birth":
                dateOfBirthPage.enterdateOfBirth();
                break;

            case "Phone Number":
                phoneNumberPage.enterphoneNumber();
                break;

            case "Address":
                addressPage.enterAddress();
                break;

            case "Apt":
                addressPage.enterApt();
                break;

            case "Weight":
                heightWeightPage.enterWeight();
                break;

            default:
                Log.info(inputBoxName + ":does not exist");
        }
    }

    @When("user Selects from drop down {string} value {string}")
    public void userSelectsFromDropDownValue(String id, String strText) {
        switch (id) {

            case "stateOfBirth":
                stateOfBirthPage.selectDropDownValue(id, strText);
                break;

            case "height":
                heightWeightPage.selectDropDownValue(id, strText);
                break;

            default:
                Log.info(id + ":does not exist");
        }

    }
}
