package PageModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestFireHomePage {
    WebDriver driver;
    By homeText = By.cssSelector("#_ctl0__ctl0_Content_Main_promo > table > tbody > tr:nth-child(1) > td > h2");

    public TestFireHomePage(WebDriver driver){
        this.driver=driver;
    }

    public String getHomeText(){
        return driver.findElement(homeText).getText();
    }
}
