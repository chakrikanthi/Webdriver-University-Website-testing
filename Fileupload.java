package WebdriverUniversityWebsitetesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h1[normalize-space()='FILE UPLOAD']")).click();

		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		System.out.println("current page is:"+driver.getTitle());
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\chakr\\Desktop\\Project .png");
		System.out.println("Project.png File got uploaded successlly ");
		
	
				String txt=driver.findElement(By.id("myFile")).getAttribute("name");
				System.out.println(txt);
		driver.findElement(By.xpath("//input[@id='submit-button']")).click();
		driver.switchTo().alert().accept();
		
		/*
		
		Robot rb= new Robot();
		rb.delay(2000);
		StringSelection SS= new StringSelection("C:\\Users\\chakr\\Desktop\\Project .png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
		

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
				rb.delay(3000);
		driver.switchTo().alert().accept();*/

	}

}

/*output:current page is:File Upload
Project.png File got uploaded successlly 
filename
*/
