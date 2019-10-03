import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LegalStepOne extends LegalStepOneElements {
    WebDriver driver;

    LegalStepOne(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String GetHeadingInformationOfCompany(WebElement information) {
        return information.getText();
    }

    public void GetSearchCompany(String input) {
        getInputSearch().sendKeys(input);
        WebElement result = getListRezultSearch();
        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(result)
                .click().build();
        seriesOfActions.perform();
    }

    public void GetCheckFieldValueInformation() {
        GetSearchCompany("Sidenis");
        String valueFullName = getFullNameInput().getAttribute("value");
        String valueShortName = getShortNameInput().getAttribute("value");
        String valueInn = getInnInput().getAttribute("value");
        String valueKpp = getKppInput().getAttribute("value");
        String valueOgrn = getOgrnInput().getAttribute("value");
        String valueManagementName = getManagementNameInput().getAttribute("value");
        String valueManagementPost = getManagementPostInput().getAttribute("value");
        String valueManagementBasis = getManagementBasisInput().getAttribute("value");
        String valuePostalCode = getPostalCodeInput().getAttribute("value");
        String valueRegion = getRegionInput().getAttribute("value");
        String valueCity = getCityInput().getAttribute("value");
        String valueStreet = getStreetInput().getAttribute("value");
        String valueHouse = getHouseInput().getAttribute("value");
        System.out.println(valueFullName); Assert.assertNotNull(valueFullName);
        System.out.println(valueShortName); Assert.assertNotNull(valueShortName);
        System.out.println(valueInn); Assert.assertNotNull(valueInn);
        System.out.println(valueKpp); Assert.assertNotNull(valueKpp);
        System.out.println(valueOgrn); Assert.assertNotNull(valueOgrn);
        System.out.println(valueManagementName); Assert.assertNotNull(valueManagementName);
        System.out.println(valueManagementPost); Assert.assertNotNull(valueManagementPost);
        System.out.println(valueManagementBasis); Assert.assertNotNull(valueManagementBasis);
        System.out.println(valuePostalCode); Assert.assertNotNull(valuePostalCode);
        System.out.println(valueRegion); Assert.assertNotNull(valueRegion);
        System.out.println(valueCity); Assert.assertNotNull(valueCity);
        System.out.println(valueStreet); Assert.assertNotNull(valueStreet);
        System.out.println(valueHouse); Assert.assertNotNull(valueHouse);
    }

    public void GetMailingAddress (){
        GetSearchCompany("Sidenis");
        getCheckboxMailingAddress().click();
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOf(getHeadingMailingAddress()));
    }

    public LegalStepTwo GetSignatureSelection(){
        GetSearchCompany("Sidenis");
        getButtonFurther().click();
        return new LegalStepTwo(driver);
    }
    public void GetClearInput(String input){
        getInputSearch().sendKeys(input);
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.elementToBeClickable(getButtonClearInput()));
        getButtonClearInput().click();
    }

}
