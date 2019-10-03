import org.openqa.selenium.WebDriver;

public class LegalStepTwo extends LegalStepTwoElements {
    WebDriver driver;

    LegalStepTwo (WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
