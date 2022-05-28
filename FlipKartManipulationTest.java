package module_8;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipKartManipulationTest {

	WebDriver driver;

	/*
	 * @BeforeTest(alwaysRun =true) which means
	 * 
	 * In order to ensure that @BeforeSuite and @BeforeTest are executed
	 *  all the time, please enable the attribute alwaysRun=true for these annotations.

		This is required because when you run through groups, these configuration methods 
		wont be selected by TestNG until and unless they are part of the group which you selected.
	 */
	@BeforeTest(alwaysRun=true)
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a3slap05\\Desktop\\SELENIUM\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();

	}

	@Test(priority = 1, groups= {"Sanity"})
	public void closeLoginModal() {
		
		/*
		 * Close the modal window
		 */
		 
		WebElement closeButton = driver.findElement(By.xpath("//button[text()='✕']"));
		closeButton.click();
	}

	@Test(priority = 2,groups= {"Sanity"})
	public void mouseOverElectronic() throws InterruptedException {
		

		// Find the Electronic tab and mouse over is done using Action
		// moveToElement
		WebElement hoverElectronic = driver.findElement(By.xpath("//div[text()='Electronics']"));

		Actions a = new Actions(driver);
		a.moveToElement(hoverElectronic).perform();

		// Find the ElectronicGST Store
		WebElement electronicGSTStore = driver.findElement(By.xpath("//a[text()='Electronics GST Store']"));

		// Mouse over the ElectronicGST and click the ElectronicGST Store option
		a.moveToElement(electronicGSTStore).click(electronicGSTStore).perform();

		// Find The Electronic tab and do the Mouseover using moveToElement
		// ExplicitWait used to wait until the Electronic tab loads
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Electronics']")));
		WebElement Electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		a.moveToElement(Electronics).perform();

		System.out.println("Checking the title heading1=" + driver.getTitle());

		// Explicit waitused for MI to load .Find the MI option and click the Mi Option
		WebDriverWait waitForMI = new WebDriverWait(driver, 20);
		waitForMI.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Mi']")));
		WebElement mi = driver.findElement(By.xpath("//a[text()='Mi']"));
		a.moveToElement(mi).click(mi).perform();

	}

	@Test(priority = 3,groups= {"Sanity"})
	/*
	 * Verify ‘Latest from MI” label on the search result page
	 */

	public void LabelVerify() throws InterruptedException {
		
		String expectedValue = "Latest from MI : Redmi Go";

		WebDriverWait waitfor = new WebDriverWait(driver, 30);
		waitfor.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Latest from MI : ']")));

		WebElement actualValue = driver.findElement(By.xpath("//p[text()='Latest from MI : ']"));

		// Compare the expected value with the actual value with Assert
		Assert.assertEquals(actualValue.getText().toString(), expectedValue, "  The Label is Verified");

	}

	@Test(priority = 4,groups= {"Regression"})
	
	/*
	 * To change the price slider using Action class wait for the price slider
	 * visibility using Explicit wait once visible move the price slider to left
	 * 
	 */

	public void ChangePriceSlider() {
		
		

		WebDriverWait waitfor = new WebDriverWait(driver, 30);
		waitfor.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='_12FhcQ']//div[@class='_2IN3-t _1mRwrD']")));
		WebElement slider = driver.findElement(By.xpath("//div[@class='_12FhcQ']//div[@class='_2IN3-t _1mRwrD']"));
		Actions movePriceSlider = new Actions(driver);
		movePriceSlider.clickAndHold(slider);
		movePriceSlider.moveByOffset(40, 0);
		movePriceSlider.release().build().perform();

	}

	
	@Test(priority = 5,groups= {"Regression"})
	
	/*
	 * Change the price slider by selecting the third option from the Max Drop down
	 * 
	 */
	
	
	public void changePriceSliderUsingDropDownMax() {

		
		WebElement maxDropdown = driver.findElement(By.xpath("//div[@class='_3uDYxP']//select[@class='_2YxCDZ']"));
		Select dropdown = new Select(maxDropdown);
		dropdown.selectByIndex(2);

	}

	@Test(priority = 6 ,groups= {"Regression","Sanity"})
	/*
	 * Search for 'redmi go (black, 8 gb)' in the search bar
	 * 
	 * Locate the search bar element and pass value 'redmi go (black, 8 gb)' using
	 * sendkeys
	 * 
	 * Locate the search button and click on it
	 */
	public void searchRedMi() {

		WebElement search = driver.findElement(By.xpath("//input[contains(@title,'Search for products')]"));
		search.sendKeys("redmi go (black, 8 gb)");

		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();

	}

	@Test(priority = 7,groups= {"Regression"})
	/*
	 * Click on the first product displayed on the screen
	 * 
	 * 
	 */
	public void selectFirstItem() throws InterruptedException {

		Thread.sleep(2000);
		WebElement firstSearchProduct = driver.findElement(
				By.xpath("//div[@data-id='MOBFDZQHCJFYXZHX']//div[@class='_2kHMtA']//a[@class='_1fQZEK']"));
		firstSearchProduct.click();

	}

	@Test(priority = 8,groups= {"Regression"})
	/*
	 * Handle the windows using get handles and verified the price of the product
	 * greater than zero
	 */
	
	public void verifyProductAmount() {
		
		
		String parentId = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> I1 = windows.iterator();
		while (I1.hasNext()) {
			String child_windowId = I1.next();
			if (!parentId.equals(child_windowId)) {
				driver.switchTo().window(child_windowId);
				System.out.println("Pint window Child id" + child_windowId);
			}
		}

		String mobilePrice = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		// Convert the string to integer using Integer.ParseInt
		// use replaceAll to remove all unwanted characters in the string and give the
		// price as integer value
		int phonePrice = Integer.parseInt(mobilePrice.replaceAll("[^0-9]", ""));

		System.out.println("Price after removing all unwanted characters from string :" + phonePrice);
		if (phonePrice > 0) {
			System.out.println("The product amount is greater than zero ");
			System.out.println("Verified price of the phone");
		}

	}

	@Test(priority = 9,groups= {"Regression"})
	
	/*
	 * Find the play back image at the left of the window.
	 */
	
	public void leftVideoImageThumbNail() throws InterruptedException {
		
		
		WebElement imageThumbNail = driver
				.findElement(By.xpath("//li[@class='_20Gt85 _1Y_A6W']//div[@class='_3g-Cpg']"));
        //use Actions command for mouse over event to happen
		Actions a = new Actions(driver);
		a.moveToElement(imageThumbNail).click().perform();
        //Find the frame where the youtube can be played in the frame 
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='_1JqCrR']"));
		driver.switchTo().frame(frameElement);

		Thread.sleep(3000);
		//Click on the playbutton to play the video
		WebElement playButton = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
		playButton.click();

		// Change the focus of the driver from Iframe to current context window
		driver.switchTo().parentFrame();

	}

	@Test(priority = 10,groups= {"Regression"})
	/*
	 * Find the view Details and close the modal window by finding the close button
	 */
	
	public void cilckViewDetails() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement viewDetails = driver.findElement(By.xpath("//div[@class='_20cDxP']"));
		viewDetails.click();

		Thread.sleep(3000);
		WebElement modalWindow = driver.findElement(By.xpath("//button[@class='_2KpZ6l _1KAjNd']"));

		modalWindow.click();
	}

	@Test(priority = 11,groups= {"Regression"})
	/*
	 * To find the notify button and click on it
	 * close the the modal popup by clicking deny button
	 */
	
	public void Notify() {
		

		WebElement notifyButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2uS5ZX _2Dfasx']"));

		notifyButton.click();

		WebElement denyButton = driver.findElement(By.xpath("//button[@class='N2KxHO']"));
		denyButton.click();

	}

	@Test(priority = 12,groups= {"Sanity"})
	/*
	 * Quit the browser
	 */
	
	public void closeBrowser() {
     driver.quit();
	}
}