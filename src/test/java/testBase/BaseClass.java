package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	
	@BeforeClass
	public void setUp() throws IOException {
		
		fis= new FileInputStream(System.getProperty("user.dir")+"\\resources\\config.properties");
		prop= new Properties();
		prop.load(fis);
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));

	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
