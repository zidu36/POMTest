package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestFireLogin {
    WebDriver driver;

    @FindBy(id = "uid")
    WebElement userTestFireName ;

    @FindBy(id = "passw")
    WebElement passwordTestFire ;

    @FindBy(name = "btnSubmit")
    WebElement login ;

    public TestFireLogin(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void setUserName(String strUserName){
       userTestFireName.sendKeys(strUserName);;
    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        passwordTestFire.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
        login.click();
    }

    public void loginTestFire(String userName,String password){
        this.setUserName(userName);
        this.setPassword(password);
        this.clickLogin();
    }

}
