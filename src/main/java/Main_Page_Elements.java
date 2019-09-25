import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main_Page_Elements {
    private WebDriver driver;
   Main_Page_Elements (WebDriver driver){this.driver = driver;}

   By heading = By.xpath("//h1[text()='Мои подписи']");
   By signatureButton = By.xpath("//button[contains(text(),'Получить подпись')]");
   By inputSearch = By.xpath("//input[@name='search']");
   By statusList = By.xpath("(//div[contains(text(),'Все статусы')])[1]");
   By buttonOnlyCompleted = By.xpath("(//md-switch[@data-ng-change='$ctrl.getProcessList()']/div/div)[1]");
   By emailProfile = By.xpath("//span[@class='uc-header__email ng-binding ng-scope']");
   By logotip = By.xpath("//img[@class='uc-header__logo']");
   By phone = By.xpath("//a[@class='uc-header__txt ng-binding']");


    public WebElement getHeading (){return driver.findElement(heading);}
    public WebElement getSignatureButton (){return driver.findElement(signatureButton);}
    public WebElement getInputSearch (){return driver.findElement(inputSearch);}
    public WebElement getStatusList (){return driver.findElement(statusList);}
    public WebElement getButtonOnlyCompleted (){return driver.findElement(buttonOnlyCompleted);}
    public WebElement getEmailProfile (){return driver.findElement(emailProfile);}
    public WebElement getLogotip (){return driver.findElement(logotip);}
    public WebElement getPhone (){return driver.findElement(phone);}
}
