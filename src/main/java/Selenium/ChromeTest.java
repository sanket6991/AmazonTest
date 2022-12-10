package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

	public static void main(String[] args) {
		 //System.setProperty("webdriver.chrome.driver","/home/sanketchakradeo/Desktop/chromedriver");
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	    driver.get("http://10.0.100.20:8000/login");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div/div/div/div/div[2]/div/form/div[2]/button")).click();
	   driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys("supervisor");
	   driver.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys("Sangli1");
	   driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
	   WebElement s1 = driver.findElement(By.xpath("//*[@id=\"basic-nav-dropdown\"]"));
	   String act = s1.getText();
	   System.out.println("Login Successfull with user :" + act);
	  
	    /*//username.sendKeys("8600234923");
	    driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	    WebElement password = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
	    password.sendKeys("QAZxsw23@");
	    driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	    //driver.findElement(By.xpath("//*[@id=\"a-popover-root\"]")).click();
	    WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	    search.sendKeys("Iphone 13 pro max");
	    driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	   // 	 driver.findElement(By.xpath())
	  //*[@id="root"]/div/section/div/div/div/div/div/div[2]/div/form/div[2]/button   
//*[@id="j_username"]
	}*/
	}

}
