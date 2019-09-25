import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends MainPageElements {
    WebDriver driver;


    MainPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String GetHeadingText(WebElement heading){
       return heading.getText();
    }
}
