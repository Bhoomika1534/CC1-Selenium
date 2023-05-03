package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		name.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pwd.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		Login.click();
		Thread.sleep(2000);
		WebElement filter=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		filter.click();
		Thread.sleep(2000);
		WebElement filter1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]"));
		filter1.click();
		Thread.sleep(2000);
		String atoz=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println("A to Z First Product Name: "+atoz);
		WebElement f3=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]"));
		f3.click();
		Thread.sleep(2000);
		String ztoa=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		System.out.println("Z to A First Product Name: "+ztoa);
		Thread.sleep(1000);
		WebElement f4=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]"));
		f4.click();
		Thread.sleep(2000);
		String ltoh=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		System.out.println("Low to High First Product Name: "+ltoh);
		WebElement f5=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
		f5.click();
		Thread.sleep(2000);
		String htol=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		System.out.println("High to Low First Product Name: "+htol);
		Thread.sleep(1000);
		
		

	}

}