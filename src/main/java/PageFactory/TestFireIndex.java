package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestFireIndex {
    WebDriver driver;
    @FindBy(id = "LoginLink")
    WebElement signIn;
    public TestFireIndex( WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickMoveTo(){
         signIn.click();
    }

}
