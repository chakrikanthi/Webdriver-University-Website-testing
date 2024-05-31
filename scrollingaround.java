package WebdriverUniversityWebsitetesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollingaround {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//h1[normalize-space()='SCROLLING AROUND']")).click();

		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));  //instead of this single line u can write below two lines also
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
		
		WebElement zone1=driver.findElement(By.xpath("//div[@id='zone1']"));
		WebElement Zone2=driver.findElement(By.xpath("//h1[@id='zone2-entries']"));
		WebElement Zone3=driver.findElement(By.xpath(" //h1[@id='zone3-entries']"));
		WebElement Zone4=driver.findElement(By.xpath("//div[@id='zone4']"));
		Actions act= new Actions(driver);
		act.click(zone1).perform();
		act.click(Zone2).perform();
		act.click(Zone3).perform();
		act.click(Zone2).perform();
		act.click(Zone4).perform();
		act.click(Zone2).perform();
		act.click(Zone3).perform();
		System.out.println(zone1.getText());
		System.out.println(Zone2.getText());
		System.out.println(Zone3.getText());
		System.out.println(Zone4.getText());
		driver.quit();
	}

}

/*output:Well done for scrolling to me!
3 Entries
2 Entries
X: 936Y: 816
*/