import org.openqa.selenium.WebDriver;

public class LegalStepOne extends LegalStepOneElements{
WebDriver driver;
    LegalStepOne (WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
