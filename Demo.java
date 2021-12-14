import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Geetu\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		//driver.get("https://www.toolsqa.com");
		//driver.findElement(By.xpath("//button[@class='btn btn-icon']")).sendKeys("Selenium");
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		
	}

}
