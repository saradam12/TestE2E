package Amazon;

import org.testng.annotations.Test;
import Resource.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class HomePage extends Base {
	public WebDriver driver;
	
 
  @BeforeTest
  public void initialize() throws IOException{
	  driver = initializeDriver();
  }
  

  @Test
public void basePageNavigation() throws IOException {
	  driver = initializeDriver();
	  driver.get("https://www.linkedin.com/");
	  
	  LandingPage lpage = new LandingPage();
	  lpage.getLogin().click();
	  
	  LoginPage logpage = new LoginPage();
	  logpage.getEmail().clear();
	  logpage.getEmail().sendKeys("sarada.m12@gmail.com");
	  
	  LoginPage password = new LoginPage();
	  password.getPassword().clear();
	  logpage.getPassword().sendKeys("Tulmaa!9849");
}
}