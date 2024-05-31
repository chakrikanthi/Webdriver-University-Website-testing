package WebdriverUniversityWebsitetesting;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ContactusNLoginPortal {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//contact us
		String mainwindow= driver.getWindowHandle();
		System.out.println(mainwindow+driver.getTitle());
		WebElement ContactUslink=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		ContactUslink.click();
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		String str= RandomStringUtils.randomAlphabetic(8);
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
		Firstname.sendKeys(str);
		
		WebElement Lastname=driver.findElement(By.xpath("//input[@name='last_name']"));
		Lastname.sendKeys(str);
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys(str+"@gmail.com");
		
		WebElement Comment=driver.findElement(By.xpath("//textarea[@name='message']"));
		Comment.sendKeys(str);
		
		WebElement Submitbtn=driver.findElement(By.xpath("//input[@class='contact_button'][@value='SUBMIT']"));
		Submitbtn.click();
		
		WebElement Successmsg=driver.findElement(By.xpath("//h1[text()='Thank You for your Message!']"));
		String text=Successmsg.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Thank You for your Message!");
		
        driver.close();
        
        //login
        driver.switchTo().window(mainwindow);
        WebElement loginbtn=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
        loginbtn.click();
        
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        
        //don't have proper login data-- so login will fail automatically
        WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
        username.click();
        username.sendKeys(str);
        
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.click();
        password.sendKeys(str);
        
        WebElement loginbtn1=driver.findElement(By.xpath("//button[@id='login-button']"));
        loginbtn1.click();
       
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.quit();
        
	}

}

////output:CFE6769B315A66317412B290EA0BBA9AWebDriverUniversity.com
//Thank You for your Message!
//validation failed