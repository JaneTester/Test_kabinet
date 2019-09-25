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

public class Login_Page_Test {
    public WebDriver driver;
    public Login_Page login_page;
    public Login_Page_Elements loginElements;
    public Main_Page_Elements mainElements;
    public Main_Page main_page;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Melkish\\IdeaProjects\\Kabinet\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://lk.thisisit.ru/login");
        login_page = new Login_Page(driver);
        loginElements = new Login_Page_Elements(driver);
        mainElements = new Main_Page_Elements(driver);
        main_page = new Main_Page(driver);
        WebDriverWait wait = (new WebDriverWait(driver, 10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='uc-preloader__inner']")));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
    }

    @Test
    public void SignInAccountTest(){
        login_page.SignInAccount(loginElements.getLogin(),loginElements.getPassword(), loginElements.getButtonLogin());
        String heading = main_page.GetHeadingText(mainElements.getHeading());
        Assert.assertEquals("Мои подписи", heading);

    }


    @Test
    public void ErrorLoginTextTest() {
        String error = login_page.GetErrorLoginText(loginElements.getLogin(), loginElements.getButtonLogin(), loginElements.getLoginError());
        Assert.assertEquals("Обязательное поле", error);
    }

    @Test
    public void ErrorPasswordTextTest() {
        String error = login_page.GetErrorPasswordText(loginElements.getPassword(), loginElements.getButtonLogin(), loginElements.getPasswordError());
        Assert.assertEquals("Обязательное поле", error);
    }
    @Test
    public void FormForgotPasswordTest (){
        login_page.GetFormForgotPassword(loginElements.getButtonForgotPassword(), loginElements.getFormForgotPassword());
        //Assert.assertEquals("Восстановление пароля", heading);
    }

//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}
