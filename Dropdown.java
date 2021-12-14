import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geetu\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://echoecho.com/tooldropdown.htm");
		Thread.sleep(2000L);
		Select s=new Select(driver.findElement(By.xpath("//select[@name='choice']")));
		s.selectByValue("http://www.microsoft.com");*/
		

driver.get("https://echoecho.com/toolcustomforms.htm");
//driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/form/table[1]/tbody/tr[9]/td[2]/b/font/table/tbody"));
//System.out.println(driver.findElement(By.xpath("//input[@name='bordertype']")).getSize());

System.out.println(driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/form/table[3]/tbody/tr/td //input[@type='radio']")).getSize());

	}}