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


    public MainPage SignInAccount(WebElement login, WebElement pass, WebElement button) {
        login.sendKeys("EIP.test@yandex.ru");
        pass.sendKeys("IcW1jFND");
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
}
