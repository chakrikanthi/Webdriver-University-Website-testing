package WebdriverUniversityWebsitetesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement iframeslink=driver.findElement(By.xpath("//h1[normalize-space()='IFRAME']"));
		iframeslink.click();
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		System.out.println("we are in page:"+driver.findElement(By.xpath("//a[text()='WebdriverUniversity.com (IFrame)']")).getText());
		WebElement iframe1=driver.findElement(By.id("frame"));
		driver.switchTo().frame(iframe1);
		WebElement Findoutmore=driver.findElement(By.xpath("//b[text()='Find Out More!']"));
		Findoutmore.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Out More']")).click();
		System.out.println("Pressed Find out more option");
		Thread.sleep(1000);
		Findoutmore.click();
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(1000);
		System.out.println("Pressed Close option");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//body//div//div//div//div//div//li[3]")).click();
		System.out.println("Third radio  button got selected");
		
		String Firstwindowheading=driver.findElement(By.xpath("//div[@class='section-title']//p[text()='Who Are We?']")).getText();
        System.out.println("First mini wondow heading is:"+Firstwindowheading);
        
        String secondwindowheading=driver.findElement(By.xpath("//div[@class='section-title']//p[text()='GREAT SERVICE!']")).getText();
        System.out.println("Second mini wondow heading is:"+secondwindowheading);
        
        String thirdwindowheading=driver.findElement(By.xpath("//div[@class='section-title']//p[text()='Why Choose Us?']")).getText();
        System.out.println("Third mini wondow heading is:"+thirdwindowheading);
        
        String Fourthwindowheading=driver.findElement(By.xpath("//div[@class='section-title']//p[text()='Excellent Customer Service!']")).getText();
        System.out.println("Fourth mini wondow heading is:"+Fourthwindowheading);
        driver.quit();
	}

}
/*we are in page:WebdriverUniversity.com (IFrame)
Pressed Find out more option
Pressed Close option
Third radio  button got selected
First mini wondow heading is:Who Are We?
Second mini wondow heading is:GREAT SERVICE!
Third mini wondow heading is:Why Choose Us?
Fourth mini wondow heading is:Excellent Customer Service!*/