package PageModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestFireLogin {
      WebDriver driver;
      By userTestFireName = By.id("uid");
      By passwordTestFire = By.id("passw");
      By login = By.name("btnSubmit");

      public TestFireLogin(WebDriver driver){
          this.driver=driver;
      }

      public void setUserName(String strUserName){
        driver.findElement(userTestFireName).sendKeys(strUserName);;
      }

      //Set password in password textbox
      public void setPassword(String strPassword){
          driver.findElement(passwordTestFire).sendKeys(strPassword);
      }

      //Click on login button
      public void clickLogin(){
          driver.findElement(login).click();
      }

      public void loginTestFire(String userName,String password){
          this.setUserName(userName);
          this.setPassword(password);
          this.clickLogin();
      }

}
