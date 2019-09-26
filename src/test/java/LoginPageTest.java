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

public class LoginPageTest {
    public WebDriver driver;
    public LoginPage loginPage;
    public LoginPageElements loginElements;
    public MainPageElements mainElements;
    public MainPage mainPage;

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
        WebDriverWait wait = (new WebDriverWait(driver, 10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='uc-preloader__inner']")));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
    }

    @Test
    public void SignInAccountTest() {
        loginPage.SignInAccount(loginElements.getLogin(), loginElements.getPassword(), loginElements.getButtonLogin());
        String heading = mainPage.GetHeadingText(mainElements.getHeading());
        Assert.assertEquals("Мои подписи", heading);

    }


    @Test
    public void ErrorLoginTextTest() {
        String error = loginPage.GetInputErrorText(loginElements.getLogin(), loginElements.getButtonLogin(), loginElements.getLoginError());
        Assert.assertEquals("Обязательное поле", error);
    }

    @Test
    public void ErrorPasswordTextTest() {
        String error = loginPage.GetInputErrorText(loginElements.getPassword(), loginElements.getButtonLogin(), loginElements.getPasswordError());
        Assert.assertEquals("Обязательное поле", error);
    }

    @Test
    public void FormForgotPasswordTest() {
        String heading = loginPage.GetFormForgotPassword();
        Assert.assertEquals("Восстановление пароля", heading);
    }

    @Test
    public void NewPasswordTest() {
        String heading = loginPage.GetNewPassword();
        Assert.assertEquals("Мы отправили новый пароль на Вашу почту.", heading);
    }
@Test
public void CloseFormTest(){
        loginPage.GetCloseForm();
}

    @After
    public void tearDown() {
        driver.quit();
    }
}
