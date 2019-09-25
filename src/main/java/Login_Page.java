import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
    private WebDriver driver;
    Login_Page_Elements loginElements = new Login_Page_Elements(driver);


    Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    public Main_Page SignInAccount(WebElement login, WebElement pass, WebElement button) {
        login.sendKeys("EIP.test@yandex.ru");
        pass.sendKeys("IcW1jFND");
        button.click();
        return new Main_Page(driver);
    }

    public String GetErrorLoginText(WebElement input, WebElement button, WebElement error) {
        input.sendKeys(" ");
        button.click();
        return error.getText();
    }

    public String GetErrorPasswordText(WebElement input, WebElement button, WebElement error) {
        input.sendKeys("");
        button.click();
        return error.getText();
    }

    public void GetFormForgotPassword(WebElement button, WebElement form) {
        button.click();
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOfAllElements(form));
    }
}
