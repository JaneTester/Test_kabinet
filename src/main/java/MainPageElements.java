import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageElements {
    private WebDriver driver;

    MainPageElements(WebDriver driver) {
        this.driver = driver;
    }

    By heading = By.xpath("//h1[text()='Мои подписи']");
    By signatureButton = By.xpath("//button[contains(text(),'Получить подпись')]");
    By inputSearch = By.xpath("//input[@name='search']");
    By statusList = By.xpath("(//div[contains(text(),'Все статусы')])[1]");
    By buttonOnlyCompleted = By.xpath("//div[@class='md-thumb md-ink-ripple']");
    By emailProfile = By.xpath("//span[@class='uc-header__email ng-binding ng-scope']");
    By logotip = By.xpath("//img[@class='uc-header__logo']");
    By phone = By.xpath("//a[@class='uc-header__txt ng-binding']");
    By formWithInformation = By.xpath("//section[@class='uc-panel uc-panel--aside']");
    By legalProfile = By.xpath("//a[contains(text(),'для Юридического лица')]");
    By individualProfile = By.xpath("//a[contains(text(),'для Индивидуального предпринимателя')]");
    By personProfile = By.xpath("//a[contains(text(),'для Физического лица')]");
    By positiveResultSearch = By.xpath("//div[@class='md-padding md-whiteframe-3dp uc-card ng-scope']");
    By negativeResultSearch = By.xpath("//h3[text()='Не найдено']");
    By buttonDeleteProcess = By.xpath("(//button[@aria-label='Удалить'])[1]//i");
    By dialogWindow = By.xpath("//md-dialog[@aria-label='Вы действительно хотите ...']");
    By buttonConfirmationOfDeletion = By.xpath("//md-dialog[@aria-label='Вы действительно хотите ...']//button[text()='Удалить']");
    By buttonCancelDeletion = By.xpath("//md-dialog[@aria-label='Вы действительно хотите ...']//button[text()='Отмена']");


    public WebElement getHeading() {return driver.findElement(heading);}
    public WebElement getSignatureButton() {return driver.findElement(signatureButton);}
    public WebElement getInputSearch() {return driver.findElement(inputSearch);}
    public WebElement getStatusList() {return driver.findElement(statusList);}
    public WebElement getButtonOnlyCompleted() {return driver.findElement(buttonOnlyCompleted);}
    public WebElement getEmailProfile() {return driver.findElement(emailProfile);}
    public WebElement getLogotip() {return driver.findElement(logotip);}
    public WebElement getPhone() {return driver.findElement(phone);}
    public WebElement getFormWithInformation() {return driver.findElement(formWithInformation);}
    public WebElement getLegalProfile() {return driver.findElement(legalProfile);}
    public WebElement getIndividualProfile() {return driver.findElement(individualProfile);}
    public WebElement getPersonProfile() {return driver.findElement(personProfile);}
    public WebElement getPositiveResultSearch() {return driver.findElement(positiveResultSearch);}
    public WebElement getNegativeResultSearch() {return driver.findElement(negativeResultSearch);}
    public WebElement getButtonDeleteProcess() {return driver.findElement(buttonDeleteProcess);}
    public WebElement getDialogWindow() {return driver.findElement(dialogWindow);}
    public WebElement getButtonConfirmationOfDeletion() {return driver.findElement(buttonConfirmationOfDeletion);}
    public WebElement getButtonCancelDeletion() {return driver.findElement(buttonCancelDeletion);}


}
