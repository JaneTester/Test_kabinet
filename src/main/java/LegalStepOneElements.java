import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LegalStepOneElements {
    WebDriver driver;

    LegalStepOneElements(WebDriver driver) {
        this.driver = driver;
    }

    By inputSearch = By.xpath("//input[@type='search']");
    By listRezultSearch = By.xpath("(//span[@md-highlight-text='_ctrl.searchCompanyText'])[1]");
    By buttonEnterDataManually = By.xpath("//button[contains(@class,'md-accent')]");
    By buttonClearInput = By.xpath("//button[@aria-label='Clear Input']");
    By headingCompanyDetails = By.xpath("//h3[text()='Реквизиты организации']");
    By headingManagerDetails = By.xpath("//h3[text()='Данные руководителя']");
    By headingLegalAddress = By.xpath("//h3[text()='Юридический адрес']");
    By headingBankDetails = By.xpath("//h3[text()='Банковские реквизиты']");
    By buttonFurther = By.xpath("//button[contains(text(), 'Далее')]");
    By fullNameInput = By.xpath("//input[@name='fullName']");
    By shortNameInput = By.xpath("//input[@name='shortName']");
    By innInput = By.xpath("//input[@name='inn']");
    By kppInput = By.xpath("//input[@name='kpp']");
    By ogrnInput = By.xpath("//input[@name='ogrn']");
    By managementPostInput = By.xpath("//input[@name='managementPost']");
    By managementNameInput = By.xpath("//input[@name='managementName']");
    By managementBasisInput = By.xpath("//input[@name='managementBasis']");
    By postalCodeInput = By.xpath("//input[@name='postalCode']");
    By regionInput = By.xpath("//input[@name='ucRegion']");
    By cityInput = By.xpath("//input[@name='ucCity']");
    By streetInput = By.xpath("//input[@name='street']");
    By houseInput = By.xpath("//input[@name='house']");
    By checkboxMailingAddress = By.xpath("//md-checkbox[@data-ng-change='_ctrl.changeEqualAddress()']");
    By headingMailingAddress = By.xpath("//h3[text()='Почтовый адрес']");
    By postalCodeMailingAddressInput = By.xpath("//input[@name='postalCode2']");
    By regionInputMailingAddressInput = By.xpath("//input[@name='ucRegion2']");
    By cityInputMailingAddressInput = By.xpath("//input[@name='ucCity2']");
    By streetInputMailingAddressInput = By.xpath("//input[@name='street2']");
    By houseInputMailingAddressInput = By.xpath("//input[@name='house2']");
    By jumpByRegion = By.xpath("(//div[@class='md-virtual-repeat-scroller'])[2]");
    By jumpByCity = By.xpath("//span[text()='Город ']");
    By errorMessage = By.xpath("//div[text()='Обязательное поле']");

    public WebElement getInputSearch() {return driver.findElement(inputSearch);}
    public WebElement getListRezultSearch() {return driver.findElement(listRezultSearch);}
    public WebElement getButtonEnterDataManually() {return driver.findElement(buttonEnterDataManually);}
    public WebElement getButtonClearInput() {return driver.findElement(buttonClearInput);}
    public WebElement getHeadingCompanyDetails() {return driver.findElement(headingCompanyDetails);}
    public WebElement getHeadingManagerDetails() {return driver.findElement(headingManagerDetails);}
    public WebElement getHeadingLegalAddress() {return driver.findElement(headingLegalAddress);}
    public WebElement getHeadingBankDetails() {return driver.findElement(headingBankDetails);}
    public WebElement getButtonFurther() {return driver.findElement(buttonFurther);}
    public WebElement getFullNameInput() {return driver.findElement(fullNameInput);}
    public WebElement getShortNameInput() {return driver.findElement(shortNameInput);}
    public WebElement getInnInput() {return driver.findElement(innInput);}
    public WebElement getKppInput() {return driver.findElement(kppInput);}
    public WebElement getOgrnInput() {return driver.findElement(ogrnInput);}
    public WebElement getManagementPostInput() {return driver.findElement(managementPostInput);}
    public WebElement getManagementNameInput() {return driver.findElement(managementNameInput);}
    public WebElement getManagementBasisInput() {return driver.findElement(managementBasisInput);}
    public WebElement getPostalCodeInput() {return driver.findElement(postalCodeInput);}
    public WebElement getRegionInput() {return driver.findElement(regionInput);}
    public WebElement getCityInput() {return driver.findElement(cityInput);}
    public WebElement getStreetInput() {return driver.findElement(streetInput);}
    public WebElement getHouseInput() {return driver.findElement(houseInput);}
    public WebElement getCheckboxMailingAddress() {return driver.findElement(checkboxMailingAddress);}
    public WebElement getHeadingMailingAddress() {return driver.findElement(headingMailingAddress);}
    public WebElement getPostalCodeMailingAddressInput() {return driver.findElement(postalCodeMailingAddressInput);}
    public WebElement getRegionInputMailingAddressInput() {return driver.findElement(regionInputMailingAddressInput);}
    public WebElement getCityInputMailingAddressInput() {return driver.findElement(cityInputMailingAddressInput);}
    public WebElement getStreetInputMailingAddressInput() {return driver.findElement(streetInputMailingAddressInput);}
    public WebElement getHouseInputMailingAddressInput() {return driver.findElement(houseInputMailingAddressInput);}
    public WebElement getJumpByRegion() {return driver.findElement(jumpByRegion);}
    public WebElement getJumpByCity() {return driver.findElement(jumpByCity);}
    public WebElement getErrorMessage() {return driver.findElement(errorMessage);}
}
