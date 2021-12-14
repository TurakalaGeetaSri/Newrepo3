import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geetu\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		//driver.findElement(By.xpath("//*[@class='a-m-us.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a']")).sendKeys("Refrigirator");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Refrigerator");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.get("https://www.amazon.in/s?k=refrigerator&ref=nb_sb_noss_2");
		int size=driver.findElements(By.cssSelector(".a-size-medium.a-color-base.a-text-normal")).size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String s=driver.findElements(By.cssSelector(".a-size-medium.a-color-base.a-text-normal")).get(i).getText();
			//System.out.println(s);
		    if(s.contains("Samsung 198 L 4"))
		    {
		    	//List<WebElement> p=driver.findElements(By.xpath("//span[@class='a-size-medium.a-color-base.a-text-normal']/span[@class='a-price-whole']"));
		    	String price="/Godrej-Inverter-Direct-Cool-Single-Refrigerator/dp/B08VJ4R17W/ref=sr_1_4?keywords=refrigerator&amp;qid=1638783494&amp;sr=8-4";
		    	WebElement searchPrice=driver.findElement(By.linkText(price));
		    	System.out.println((searchPrice));
		    	
		    }
		}
		/*String refrigeratorString;
		for(int i=4;i<25;i++)
		{
		String Xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div["+ i +"]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span";
		if(driver.findElements(By.xpath(Xpath)).size()>0)
		{
			WebElement SearchResult=driver.findElement(By.xpath(Xpath));
			refrigeratorString=SearchResult.getText();
			System.out.println("refrigeratorString");*/
		}
		private static char[] getsize(List<WebElement> p) {
		// TODO Auto-generated method stub
		return null;
	}
		{
			
		}
			
		
		//String text=driver.findElement(By.xpath("//span[@class=a-price-whole']")).getText();
		//System.out.println("text");
}