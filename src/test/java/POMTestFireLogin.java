import PageModule.TestFireHomePage;
import java.util.concurrent.TimeUnit;
import PageModule.TestFireIndex;
import PageModule.TestFireLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POMTestFireLogin {
    WebDriver driver;
    TestFireHomePage objHomePage;
    TestFireLogin objLogin;
    TestFireIndex objIndex;

    @BeforeTest
    public void setUp(){
//        System.setProperty("webdriver.chrome.driver","E:/学习资料/软件测试/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://www.testfire.net/");
    }

    @Test(priority=0)
    public void test_Home_Page_Appear_Correct(){
        System.setProperty("webdriver.chrome.driver","E:/学习资料/软件测试/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.testfire.net/");
        //创建首页对象，跳转登录页面
        objIndex = new TestFireIndex(driver);
        objIndex.clickMoveTo();
        //创建登录页面对象，输入指定值，登录跳转主页
        objLogin = new TestFireLogin(driver);
        objLogin.loginTestFire("admin","admin");
        //创建主页对象，获取指定内容
        objHomePage = new TestFireHomePage(driver);
        String homeText = objHomePage.getHomeText();
        //验证
        Assert.assertTrue(homeText.contains("Congratulations!"));
    }
}
