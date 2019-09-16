package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static Properties prop;
	public static WebDriver driver = null;
	
	public Base(){
		
		FileInputStream propfile = null;
		try {
			propfile = new FileInputStream("D:/workspace/GiveInSolution/src/test/java/Utilities/Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop=new Properties();
		try {
			prop.load(propfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void intialization(){
		
		String browser=prop.getProperty("browser");
		
		if(browser.contentEquals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Testing Softwares\\Browser Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.contentEquals("ie")){
			System.setProperty("webdriver.chrome.driver", "D:\\Testing Softwares\\Browser Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();			
		}else
			System.out.println("No browser defined");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
				
	}
}
