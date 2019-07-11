package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void testcase01() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
		driver.findElement(By.id("login_field")).sendKeys("loyd_pintac@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("EdithSerna143@");
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[4]")).click();
		// driver.quit();
	}

}
