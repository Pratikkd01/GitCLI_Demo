package test;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

//import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utilities_files.ReadConfig;

public class Base_class {
	ReadConfig readConfig = new ReadConfig();
	
	public static WebDriver driver;
	public static Logger logger;
	public String url = readConfig.getURL();
	public String userId = readConfig.getuser();
	public String password = readConfig.getpass();
	
	@Parameters("browser")
	@BeforeTest
    public void setup(String browser) {
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", readConfig.chromepath());
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}else if (browser.equals("firefox")) {
			try {
			System.setProperty("webdriver.gecko.driver", readConfig.firefoxpath());
			}catch(org.openqa.selenium.StaleElementReferenceException ex) {
			System.setProperty("webdriver.gecko.driver", readConfig.firefoxpath());	
			}
			driver = new FirefoxDriver();
		}else if(browser.equals("edge")) {
			System.setProperty("webdriver.edgedriver.driver", readConfig.edgepath());
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		String log4Jpath = System.getProperty("C:\\Users\\pratik_kadam\\eclipse-workspace\\banking_project\\src\\test\\resources\\log4j.properties");
//		PropertyConfigurator.configure("log4j.properties");
//		logger = LogManager.getLogger(log4Jpath);
	}
//	@BeforeTest
//	public static void loadlog4J() {
//		String log4Jpath = System.getProperty("C:\\Users\\pratik_kadam\\eclipse-workspace\\banking_project\\src\\test\\resources\\log4j.properties");
//	    PropertyConfigurator.configure(log4Jpath);
//	 
//	}
//	
//	@AfterTest
//	public static void aftertest() {
//		System.out.println("End of test execution");
//	}
	//mngr520846 //UgypYna
	
	
	@AfterTest
	public void exitapp(){
		driver.quit();
	}

}
