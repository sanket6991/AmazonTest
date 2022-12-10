package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TempClass {

	public static void main(String[] args) {
		 //System.setProperty("webdriver.chrome.driver","/home/sanketchakradeo/Desktop/chromedriver");
	    WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    WebElement username = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
	    username.sendKeys("8600234923");
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
	    

	}

}
