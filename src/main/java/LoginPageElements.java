import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElements {
    WebDriver driver;
    LoginPageElements(WebDriver driver){this.driver = driver;}

    By inputLogin = By.xpath("//input[@name='LOGIN']");
    By inputPassword = By.xpath("//input[@name='PASS']");
    By buttonLogin = By.xpath("//button[contains(text(),'Войти')]");
    By buttonForgotPassword = By.xpath("//button[contains(text(),'Забыли пароль?')]");
    By loginError = By.xpath("//div[@ng-messages='loginForm.LOGIN.$error']/div[text()='Обязательное поле']");
    By passwordError = By.xpath("//div[@ng-messages='loginForm.PASS.$error']/div[text()='Обязательное поле']");
    By formForgotPassword = By.xpath("//form[@name='RestorePassForm']");
    By headingFormForgotPassword = By.xpath("//h3[contains(text(),'Восстановление пароля')]");
    By inputEmail = By.xpath("//form[@name='RestorePassForm']//input[@type='email']");
    By buttonToSend = By.xpath("//form[@name='RestorePassForm']//button[contains(text(),'Отправить')]");
    By buttonToClose = By.xpath("//form[@name='RestorePassForm']//button[contains(text(),'Закрыть')]");
    By toolTip = By.xpath("//div[@class='uc-notify md-whiteframe-3dp ng-scope success clickable killed']");
    By headingToolTip = By.xpath("//div[text()='Мы отправили новый пароль на Вашу почту.']");



    public WebElement getLogin (){return driver.findElement(inputLogin);}
    public WebElement getPassword (){return driver.findElement(inputPassword);}
    public WebElement getButtonLogin (){return driver.findElement(buttonLogin);}
    public WebElement getButtonForgotPassword (){return driver.findElement(buttonForgotPassword);}
    public WebElement getLoginError (){return driver.findElement(loginError);}
    public WebElement getPasswordError (){return driver.findElement(passwordError);}
    public WebElement getFormForgotPassword (){return driver.findElement(formForgotPassword);}
    public WebElement getHeadingFormForgotPassword (){return driver.findElement(headingFormForgotPassword);}
    public WebElement getInputEmail (){return driver.findElement(inputEmail);}
    public WebElement getButtonToSend (){return driver.findElement(buttonToSend);}
    public WebElement getButtonToClose (){return driver.findElement(buttonToClose);}
    public WebElement getToolTip (){return driver.findElement(toolTip);}
    public WebElement getHeadingToolTip (){return driver.findElement(headingToolTip);}
}
