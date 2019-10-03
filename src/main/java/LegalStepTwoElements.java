import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LegalStepTwoElements {
    WebDriver driver;

    LegalStepTwoElements(WebDriver driver) {
        this.driver = driver;
    }
    By headingLegalStepTwo = By.xpath("//h1[text()='Выбор подписи']");

    public WebElement getHeadingLegalStepTwo() {return driver.findElement(headingLegalStepTwo);}
}
