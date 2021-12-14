import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geetu\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("_3704LK")).sendKeys("refrigerator");
		//driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		//driver.findElement(By.cssSelector(".f3A4_V")).click();
		//System.out.println(driver.findElement(By.cssSelector("_4rR01T")).getText());
		//https://www.flipkart.com/search?q=refrigerators&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off
		//*[@id="container"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div/a/div[1]/div[2]/div/span/label/div-silver
		//*[@id="container"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[1]/div[2]/div/span/label/div-merun
		//*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[2]/div/span/label/div
		for(int i=2;i<5;i++)
		{
			String Xpath="//*[@id=\'container\']/div/div[3]/div[1]/div[2]/div["+ i +"]/div/div/div/a/div[1]/div[2]/div/span/label/div";
			driver.findElement(By.xpath(Xpath)).click();
		}

		
	}

}