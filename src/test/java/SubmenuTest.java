import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SubmenuTest {

	FirefoxDriver driver = new FirefoxDriver();
	@Test
	public void apple(){
		
		driver.get("http://www.bluefly.com");
		driver.findElement(By.xpath("//li[@id='main-nav-men']/a")).click();
		//driver.findElement(By.xpath("")).click();
		
		
	}
	
	
}
