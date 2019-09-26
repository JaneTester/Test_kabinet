import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends MainPageElements {
    WebDriver driver;
    LoginPage loginPage = new LoginPage(driver);
    LoginData loginData = new LoginData();
    LoginPageElements loginElements = new LoginPageElements(driver);

    MainPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String GetHeadingText(WebElement heading) {
        return heading.getText();
    }

    public LegalStepOne GetLegalStepOne() {
        getSignatureButton().click();
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.elementToBeClickable(getLegalProfile()));
        getLegalProfile().click();
        return new LegalStepOne(driver);
    }

    public void GetSearchCompany(String input, WebElement rezult) {
        getInputSearch().sendKeys(input);
        getInputSearch().sendKeys(Keys.ENTER);
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOfAllElements(rezult));
    }
    public void GetOnlyCompleted (){
        getButtonOnlyCompleted().click();
    }
    public  void GetDeleteProcess (){
        getButtonDeleteProcess().click();
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOfAllElements(getDialogWindow()));
    }
}
