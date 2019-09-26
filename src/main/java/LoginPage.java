import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends LoginPageElements {
    WebDriver driver;

    LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
LoginData loginData = new LoginData();


    public MainPage SignInAccount(WebElement login, WebElement pass, WebElement button) {
        login.sendKeys(loginData.login);
        pass.sendKeys(loginData.password);
        button.click();
        return new MainPage(driver);
    }

    public String GetInputErrorText(WebElement input, WebElement button, WebElement error) {
        input.sendKeys("");
        button.click();
        return error.getText();
    }


    public String GetFormForgotPassword() {
        getButtonForgotPassword().click();
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOfAllElements(getFormForgotPassword()));
        return getHeadingFormForgotPassword().getText();
    }
    public String GetNewPassword (){
        getButtonForgotPassword().click();
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOfAllElements(getFormForgotPassword()));
        getInputEmail().sendKeys(loginData.login);
        getButtonToSend().click();
        WebDriverWait wait2 = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOfAllElements(getHeadingToolTip()));
        return getHeadingToolTip().getText();
    }
    public void GetCloseForm (){
        getButtonForgotPassword().click();
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOfAllElements(getFormForgotPassword()));
        getButtonToClose().click();
    }
}
