import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geetu\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/#date-picker");
		driver.findElement(By.cssSelector("//div[@class='css-76zvg2.r-jwli3a.r-xb2eav.r-majxgm.r-q4m81j']")).click();
		driver.findElement(By.cssSelector("//div[@class=ass='css-76zvg2.r-12rm3iy.r-ubezar']"));
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n.r-1awozwy.r-14lw9ot.r-1loqt21.r-1iud8zs.r-1otgn73.r-1w55eue']"));
	}

}
