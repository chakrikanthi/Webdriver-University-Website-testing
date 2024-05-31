package WebdriverUniversityWebsitetesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		String mainwindow= driver.getWindowHandle();
		System.out.println(mainwindow+driver.getTitle());
		
		WebElement PageObgmod=driver.findElement(By.xpath("//h1[text()='PAGE OBJECT MODEL']"));
		PageObgmod.click();
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		
		
		WebElement Findoutmore=driver.findElement(By.xpath("//b[text()='Find Out More!']"));
		Findoutmore.click();
		Thread.sleep(2000);
		
		WebElement Findoutmorepopup=driver.findElement(By.xpath("//div[@class='modal-footer']//button[text()='Find Out More']"));
		Findoutmorepopup.click();
		
		
		 WebElement RightArrow=driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']"));
		 RightArrow.click();
		 
		 WebElement ThirdRadiobtn=driver.findElement(By.xpath("//li[@data-slide-to='2']"));
		 ThirdRadiobtn.click();
		 driver.quit();
		 
		
	}

}
