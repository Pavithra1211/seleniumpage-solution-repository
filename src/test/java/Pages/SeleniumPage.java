package Pages;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.Base;

public class SeleniumPage extends Base{	
	
	public SeleniumPage(){
        
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "//i/a[contains(text(),'The Periodic Table of Videos')]/following::a[@class='external text']")
	private WebElement extLinkNational;
	
	@FindBy(xpath = "(//span[contains(text(),'External links')])[2]//following::ul[2]//li//a[text()='Selenium']")
	private WebElement extLinkSeleniumThePeriodicVideo;	

	@FindBy(xpath = "//a[@class='external text' and text()='Assay']")
	private WebElement extLinkAssay;
	
	@FindBy(xpath = "//a[contains(text(),'Toxicological Profile: Selenium')]")
	private WebElement extLinkATSDR;
	
	@FindBy(xpath = "//a[text()='CDC - NIOSH Pocket Guide to Chemical Hazards']")
	private WebElement extLinkCDC;
	
	@FindBy(xpath = "//a[text()='Peter van der Krogt elements site']")
	private WebElement extLinkPeterVan;	

	@FindBy(xpath = "//*[@id='mw-content-text']/div/div[19]/table/tbody/tr[2]/td/div/table/tbody/tr[3]/td[7]/a/span")
	WebElement LinkOxygen;
	
	@FindBy(xpath = "//img[@alt='This is a featured article. Click here for more information.']")
	private WebElement iconFeaturedArticle;
	
	@FindBy(xpath = "//a/span[text()='B']")
	private WebElement LinkB;
	
	@FindBy(xpath = "//a/span[text()='Og']")
	private WebElement LinkOg;
	
	@FindBy(xpath = "//div[@class='reflist columns references-column-width']//a[contains(@href,'.pdf')]")
	private List<WebElement> LinksPDF;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchbox;
	
	@FindBy(xpath = "//div[@class='suggestions-results']")
	private WebElement listSuggestions;
	

	public void fnOpenBrowser(){
		
		driver.get(prop.getProperty("URL"));
	}
	public void fnVerifytitle(String title){
		
		Assert.assertEquals("Title is matching", true, title.contentEquals(driver.getTitle()));
	}
	
	public void fnvalidateExternalLinks() throws Exception{
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", extLinkSeleniumThePeriodicVideo);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		String SeleniumTitle="Selenium Video - The Periodic Table of Videos - University of Nottingham";	
		Assert.assertEquals("Title is matching", true, SeleniumTitle.contentEquals(driver.getTitle()));
		driver.navigate().back();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		executor.executeScript("arguments[0].click();", extLinkNational);
		//extLinkNational.click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		String NationalInstitutes="Selenium — Health Professional Fact Sheet";	
		Assert.assertEquals("Title is matching", true, NationalInstitutes.contains(driver.getTitle()));
		driver.navigate().back();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		executor.executeScript("arguments[0].click();", extLinkAssay);
		//extLinkAssay.click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		String extLinkAssay="Supra-Regional Assay Service › Assays › Trace Elements › Selenium";	
		Assert.assertEquals("Title is matching", true, extLinkAssay.contentEquals(driver.getTitle()));
		driver.navigate().back();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		executor.executeScript("arguments[0].click();", extLinkATSDR);
		//extLinkATSDR.click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		String ATSDRTitle="ATSDR - Page Not Found | ATSDR";	
		Assert.assertEquals("Title is matching", true, ATSDRTitle.contentEquals(driver.getTitle()));
		driver.navigate().back();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		executor.executeScript("arguments[0].click();", extLinkPeterVan);
		//extLinkPeterVan.click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		String PeterVanTitle="34. Selenium - Elementymology & Elements Multidict";	
		Assert.assertEquals("Title is matching", true, PeterVanTitle.contentEquals(driver.getTitle()));
		
	}
	
	public void clickOxygenLink(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",LinkOxygen);
		LinkOxygen.click();
	}
	
	public void fnVerifyFeaturedArticle(){		
		Assert.assertEquals(false, iconFeaturedArticle.isDisplayed());			
	}
	
	public void fnCountPDFLinks(){	
		
		//Counting number of pdf links
		int links = LinksPDF.size();		
		Assert.assertEquals(12, links);		
	}
	
	public void fnTakeScreenShot() throws Exception{
		// Get entire page screenshot
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage  fullImg = ImageIO.read(screenshot);

		Point pointf = LinkB.getLocation();
		Point pointt = LinkOg.getLocation();

		// Crop the entire page screenshot to get only element screenshot
		BufferedImage eleScreenshot= fullImg.getSubimage(pointf.getX(), pointt.getY(),
		    600, 600);
		ImageIO.write(eleScreenshot, "png", screenshot);

		// Copy the element screenshot to disk
		String direc = System.getProperty("user.dir");
		File screenshotLocation = new File(direc+"\\test-output\\RightHandBox_screenshot.png");
		FileUtils.copyFile(screenshot, screenshotLocation);
	}
	
	public void fnSelect2ndOption(){
		
		listSuggestions.sendKeys(Keys.ARROW_DOWN);
		listSuggestions.sendKeys(Keys.ARROW_DOWN);
		listSuggestions.sendKeys(Keys.RETURN);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Assert.assertEquals("Plutonium - Wikipedia", driver.getTitle());
	}
	
	public void fnEnterPluto(){
		searchbox.sendKeys("Pluto");
	}
	
	public void teardown(){
		driver.close();
	}
	
	
	

}
