package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver, "\Users\Shivam\Documents\Chromedriver.exe")
     WebDriver driver = new ChromeDriver();
     driver.get("https://test.contractzy.io/");
     driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("leshivam@gmail.com");
     driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("i2&21@BD");
     driver.findElement(By.xpath("//*[@id=\"bodyElement\"]/app-root/div/app-login-layout/div/div/div[2]/div/div/div/div/form/button")).click();
     driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div/nav/ul/li[3]/span/a/img")).click();
     driver.findElement(By.xpath("//*[@id=\"create_new\"]")).click();
     

    
     
     
     //driver.manage().timeouts().
     //driver.findElement(By.xpath("//*[@id=\"mount_0_0_Xf\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/section/div/button")).click();
     //driver.findElement(By.className(" _acan _acap _acas _aj1- _ap30")).click();
     
    
	}

}
