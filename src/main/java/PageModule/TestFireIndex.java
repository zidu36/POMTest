package PageModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestFireIndex {
    WebDriver driver;
    By signIn = By.id("LoginLink");

    public TestFireIndex( WebDriver driver){
        this.driver=driver;
    }

    public void clickMoveTo(){
        driver.findElement(signIn).click();
    }


}
