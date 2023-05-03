package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement Username = driver.findElement(By.id("user-name"));
		Username.sendKeys("standard_user");
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        String Cart = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        String ProductName = "Sauce Labs Backpack";
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Bhoomika");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("S E");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("641008");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        System.out.println("Product Name: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
        System.out.println("Product Price: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
        
    } 
}