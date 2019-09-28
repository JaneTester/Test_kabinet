import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    public WebDriver driver;
    public LoginPage loginPage;
    public LoginPageElements loginElements;
    public MainPageElements mainElements;
    public MainPage mainPage;
    public ConfirmationPopUp confirmationPopUp;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Melkish\\IdeaProjects\\Kabinet\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://lk.thisisit.ru/login");
        loginPage = new LoginPage(driver);
        loginElements = new LoginPageElements(driver);
        mainElements = new MainPageElements(driver);
        mainPage = new MainPage(driver);
        confirmationPopUp = new ConfirmationPopUp(driver);
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='uc-preloader__inner']")));
        loginPage.SignInAccount(loginElements.getLogin(), loginElements.getPassword(), loginElements.getButtonLogin());
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div [@class='uc-preloader__inner']")));
    }
    @Test
    public void GetLegalStepOneTest (){
        mainPage.GetLegalStepOne();
        Assert.assertEquals("https://lk.thisisit.ru/personal/eds/legal/", driver.getCurrentUrl());
    }
    @Test
    public void GetSearchCompanyValidValueTest (){
        mainPage.GetSearchCompany("Алмаз", mainElements.getPositiveResultSearch() );
    }
    @Test
    public void GetSearchCompanyInValidValueTest (){
        mainPage.GetSearchCompany("Glksfog", mainElements.getNegativeResultSearch());
    }
    @Test
    public void GetOnlyCompletedTest(){
        mainPage.GetOnlyCompleted();
    }

    @Test
    public void GetDeleteProcessTest (){
        mainPage.GetDeleteProcess();
         }

//    @After
//    public void tearDown() {
//        driver.quit();
//    }

}
