package Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	
	public WebDriver driver;
	
	
	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Aarika\\eclipse-workspace\\CllyetAutomation\\TestE2E\\src\\main\\java\\Resource\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome") ) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aarika\\chromedriver.exe"); 
			WebDriver driver = new ChromeDriver();
			

		}
		else if (browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aarika\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			
		}
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			return driver;
}
	
}
