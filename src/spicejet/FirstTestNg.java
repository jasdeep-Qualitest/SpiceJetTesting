package spicejet;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstTestNg {
	
	@Test
	public void testngmethod() throws InterruptedException {
		ChromeOptions options = new ChromeOptions(); // close notification alert

		options.addArguments("--disable-notifications"); // close notification alert

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jasdeep.singh\\eclipse-workspace\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://beta.spicejet.com/");
//		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).click();
		driver.findElement(By.xpath("//div[text()='Mumbai']")).click();
		/*
		 * From destination
		 */
//		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input[@type='text']")).sendKeys("Delhi");
//		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input[@type='text']")).sendKeys("Ahm");

//		 driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input[@type='text']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Indira Gandhi International Airport']")).click();
//		 

		/*
		 * to destination
		 */
		List<WebElement> aList = driver.findElements(By.xpath("//div[@data-testid='undefined-month-October-2021']//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-1loqt21 r-eu3ka r-1otgn73 r-1aockid']"));
		Thread.sleep(5000);
		for (int i = 0; i <aList.size(); i++) {
			String valString = aList.get(i).getText();
			if (valString.equalsIgnoreCase("29")) {
				aList.get(i).click();
				System.out.println("Clicked on For");
				
				
			}
		}
//         Thread.sleep(2000);
//		 driver.findElement(By.xpath("//div[@data-testid='undefined-month-October-2021']//div[contains(text(),'28')]")).click();
		
	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();

		
		/*
		 * depart date
		 */

//		Thread.sleep(5000);
//		 driver.findElement(By.xpath("//div[@data-testid='spicemax-flight-select-radio-button-3']")).click();
		 
		 
		 /*
		  * Get Price and flight number
		  */
		 Thread.sleep(3000);
//		 driver.findElement(By.cssSelector("div[class='r-1loqt21 r-6dt33c r-1otgn73 r-1i6wzkk r-lrvibr css-1dbjc4n'] div[class='css-76zvg2 r-1xedbs3 r-n6v787 r-16dba41 r-7o8qx1 r-156q2ks']")).click();
//		 
//		 String flightNumberString=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='SG 125']")).getText();
//		 System.out.println(flightNumberString);
		
		 String flightPrice=driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-18u37iz'] div[class='css-76zvg2 r-homxoj r-1x35g6 r-1kfrs79']")).getText();
		 System.out.println(flightPrice);
		 
		 
		 
		 
		 
		 driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']")).click();
		 Thread.sleep(7000);
		 driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("Jasdeep");
         driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("Singh");

         driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("8756433776");
         driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("jasdeep@gmail.com");
         driver.findElement(By.xpath("//input[@data-testid='city-inputbox-contact-details']")).sendKeys("Maigal Ganj");
         
         driver.findElement(By.xpath("//div[text()='I am flying as the primary passenger']")).click();
         
         driver.findElement(By.cssSelector("div[data-testid='traveller-info-continue-cta']")).click(); //Continue to seat page
         
         Thread.sleep(10000);
//         add seat
         driver.findElement(By.cssSelector("div[data-testid=\"bookingFlow-seats-add-cta\"]")).click(); 
         Thread.sleep(5000);
          driver.findElement(By.xpath("//div[text()='24B']")).click();
          System.out.println("Clicked on Seat");
          Thread.sleep(2000);
          
          WebElement scanEle = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.css-1dbjc4n.r-k200y.r-14lw9ot.r-6t5ypu.r-kicko2.r-18u37iz.r-17s6mgv.r-nt9dsb.r-1pvhfgn.r-wsh07t.r-kmv1fd.r-bnwqim.r-1ki14p2")));

          Actions action = new Actions(driver);

          action.moveToElement(scanEle).click().perform();
          
          Thread.sleep(5000);
          
          System.out.println("Clicked on done btn");

          driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")).click();
          
          System.out.println("Clicked on Continue btn");
          


		 
		
	}

}
