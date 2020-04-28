import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoPOMTestFireLogin {

    @Test
    public void test_Home_Page_Appear_Test(){
        System.setProperty("webdriver.chrome.driver","E:/学习资料/软件测试/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.testfire.net/");
        driver.findElement(By.id("LoginLink")).click();
        driver.findElement(By.id("uid")).sendKeys("admin");
        driver.findElement(By.id("passw")).sendKeys("admin");
        driver.findElement(By.name("btnSubmit")).click();
        String homeText = driver.findElement(By.cssSelector("#_ctl0__ctl0_Content_Main_promo > table > tbody > tr:nth-child(1) > td > h2")).getText();
        System.out.println(homeText);
        Assert.assertTrue(homeText.contains("Congratulations!"));
    }
}
