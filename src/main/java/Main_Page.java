import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main_Page {
    private WebDriver driver;
    Login_Page_Elements loginElements = new Login_Page_Elements(driver);
    Main_Page_Elements mainElements = new Main_Page_Elements(driver);

    Main_Page(WebDriver driver) {
        this.driver = driver;
    }

    public String GetHeadingText(WebElement heading){
       return heading.getText();
    }
}
