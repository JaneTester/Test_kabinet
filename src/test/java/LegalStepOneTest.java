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

public class LegalStepOneTest {
    public WebDriver driver;
    LoginPage loginPage;
    LoginPageElements loginElements;
    MainPage mainPage;
    LegalStepOne legalStepOne;
    LegalStepOneElements legalStepOneElements;
    LegalStepTwoElements legalStepTwoElements;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Melkish\\IdeaProjects\\Kabinet\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://lk.thisisit.ru/login");
        loginPage = new LoginPage(driver);
        loginElements = new LoginPageElements(driver);
        mainPage = new MainPage(driver);
        legalStepOne = new LegalStepOne(driver);
        legalStepOneElements = new LegalStepOneElements(driver);
        legalStepTwoElements = new LegalStepTwoElements(driver);
//      confirmationPopUp = new ConfirmationPopUp(driver);
        WebDriverWait wait = (new WebDriverWait(driver, 7));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='uc-preloader__inner']")));
        loginPage.SignInAccount(loginElements.getLogin(), loginElements.getPassword(), loginElements.getButtonLogin());
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div [@class='uc-preloader__inner']")));
        mainPage.GetLegalStepOne();
    }

    @Test
    public void GetSearchCompanyTest(){
      legalStepOne.GetSearchCompany("Sidenis");
        Assert.assertEquals("Реквизиты организации",legalStepOne.GetHeadingInformationOfCompany(legalStepOneElements.getHeadingCompanyDetails()));
        Assert.assertEquals("Данные руководителя",legalStepOne.GetHeadingInformationOfCompany(legalStepOneElements.getHeadingManagerDetails()));
        Assert.assertEquals("Юридический адрес",legalStepOne.GetHeadingInformationOfCompany(legalStepOneElements.getHeadingLegalAddress()));
        Assert.assertEquals("Банковские реквизиты",legalStepOne.GetHeadingInformationOfCompany(legalStepOneElements.getHeadingBankDetails()));
    }

    @Test
    public void GetCheckFieldValueInformationTest(){
        legalStepOne.GetCheckFieldValueInformation();
    }

    @Test
    public void GetMailingAddressTest (){
        legalStepOne.GetMailingAddress();
        Assert.assertEquals("Почтовый адрес", legalStepOneElements.getHeadingMailingAddress().getText());
    }

    @Test
    public void GetSignatureSelectionTest(){
        legalStepOne.GetSignatureSelection();
        WebDriverWait wait = (new WebDriverWait(driver, 7));
        wait.until(ExpectedConditions.visibilityOf(legalStepTwoElements.getHeadingLegalStepTwo()));
        Assert.assertEquals("Выбор подписи", legalStepTwoElements.getHeadingLegalStepTwo().getText());
    }
    @Test
    public void GetClearInputTest(){
        legalStepOne.GetClearInput("Привет");
    }

    @Test
    public void GetManualInputTest(){
        legalStepOne.GetManualInput();
    }


//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}
