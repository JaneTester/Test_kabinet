import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LegalStepOneElements {
    WebDriver driver;
    LegalStepOneElements(WebDriver driver){this.driver = driver;}
    By inputSearch = By.xpath("//input[@type='search']");
    By buttonEnterDataManually = By.xpath("//button[contains(@class,'md-accent')]");
    By buttonClearInput = By.xpath("//button[@aria-label='Clear Input']");
    By companyDetails = By.xpath("//h3[text()='Реквизиты организации']");
    By managerDetails = By.xpath("//h3[text()='Данные руководителя']");
    By legalAddress = By.xpath("//h3[text()='Юридический адрес']");
    By bankDetails = By.xpath("//h3[text()='Банковские реквизиты']");
    By furtherButton = By.xpath("//button[contains(text(), 'Далее')]");
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
    By jumpByRegion = By.xpath("(//div[@class='md-virtual-repeat-scroller'])[2]");
    By jumpByCity = By.xpath("//span[text()='Город ']");

    public WebElement getInputSearch() {return driver.findElement(inputSearch);}
    public WebElement getButtonEnterDataManually() {return driver.findElement(buttonEnterDataManually);}
    public WebElement getButtonClearInput(){return driver.findElement(buttonClearInput);}
    public WebElement getCompanyDetails() {return driver.findElement(companyDetails);}
    public WebElement getManagerDetails() {return driver.findElement(managerDetails);}
    public WebElement getLegalAddress() {return driver.findElement(legalAddress);}
    public WebElement getBankDetails() {return driver.findElement(bankDetails);}
    public WebElement getFurtherButton() {return driver.findElement(furtherButton);}
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
    public WebElement getJumpByRegion() {return driver.findElement(jumpByRegion);}
    public WebElement getJumpByCity() {return driver.findElement(jumpByCity);}
}
