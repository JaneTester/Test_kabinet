import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends MainPageElements {
    WebDriver driver;

    MainPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //LoginPage loginPage = new LoginPage(driver);
    LoginData loginData = new LoginData();
    //LoginPageElements loginElements = new LoginPageElements(driver);


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

    public void GetOnlyCompleted() {
        getButtonOnlyCompleted().click();
    }

    public void GetDeleteProcess() {
        getButtonDeleteProcess().click();
        System.out.println(getButtonDeleteProcess());
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOfAllElements(getDialogWindow()));
        WebElement result = getDialogWindow();
        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(result)
                .click().build();
        seriesOfActions.perform();
       getButtonConfirmationOfDeletion().click();
    }

    public void GetCancelDeletionProcess() {
        getButtonDeleteProcess().click();
        System.out.println(getButtonDeleteProcess());
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.visibilityOfAllElements(getDialogWindow()));
        WebElement result = getDialogWindow();
        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(result)
                .click().build();
        seriesOfActions.perform();
        getButtonCancelDeletion().click();

    }
}
