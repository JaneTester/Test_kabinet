import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPopUp {
   WebDriver driver;
  ConfirmationPopUp(WebDriver driver){this.driver = driver;}

    By dialogWindow = By.xpath("//md-dialog[@aria-label='Вы действительно хотите ...']");
    By buttonConfirmationOfDeletion = By.xpath("//md-dialog[@aria-label='Вы действительно хотите ...']//button[text()='Удалить']");
    By buttonCancelDeletion = By.xpath("//md-dialog[@aria-label='Вы действительно хотите ...']//button[text()='Отмена']");


    public WebElement getDialogWindow() {
    System.out.println(driver);
    return driver.findElement(dialogWindow);}
    public WebElement getButtonConfirmationOfDeletion() {return driver.findElement(buttonConfirmationOfDeletion);}
    public WebElement getButtonCancelDeletion() {return driver.findElement(buttonCancelDeletion);}
}
