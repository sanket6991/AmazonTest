package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshUI {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.gecko.driver", "/home/sanketchakradeo/Desktop/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http:google.co.in");
		//driver.get("http://erp-dev.chitalegroup.co.in");
		/*driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div/div/div/div/div[2]/div/form/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys("Approver1");
		driver.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys("Sangli1");
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click(); */
		
		while(true) {
		Thread.sleep(5000);
		driver.navigate().refresh();
		//WebElement E = driver.findElement(By.xpath("//*[@id=\"basic-nav-dropdown\"]"));
		//String act = E.getText();
		//System.out.println(act);
		}
		

	}

}
