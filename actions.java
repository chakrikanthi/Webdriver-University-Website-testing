package WebdriverUniversityWebsitetesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//h1[text()='ACTIONS']")).click();
        
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        WebElement dropbox1=driver.findElement(By.xpath("//b[text()='DRAG ME TO MY TARGET!']"));
        WebElement dropbox2=driver.findElement(By.xpath("//b[text()='DROP HERE!']"));
        Actions act= new Actions(driver);
        act.dragAndDrop(dropbox1, dropbox2).perform();
        
        WebElement doubleclick=driver.findElement(By.xpath("//div[@id='double-click']"));
        act.doubleClick(doubleclick).perform();
        Thread.sleep(2000);
        act.doubleClick(doubleclick).perform();
        
        WebElement firsthover=driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
        WebElement click1=driver.findElement(By.xpath("//div[@id='div-hover']//div[1]//div[1]//a[1]"));
        act.moveToElement(firsthover).click(click1).perform();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        
        WebElement secondhover=driver.findElement(By.xpath(" //button[normalize-space()='Hover Over Me Second!']"));
        WebElement click2=driver.findElement(By.xpath("//div[@style='float:center;']//a[text()='Link 1']"));
        act.moveToElement(secondhover).click(click2).perform();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        
        WebElement thirdhover=driver.findElement(By.xpath("//button[normalize-space()='Hover Over Me Third!']"));
        WebElement click3=driver.findElement(By.xpath("//div[@style='float:right;']//a[text()='Link 1'][1]"));
        WebElement click4=driver.findElement(By.xpath("//div[@style='float:right;']//a[text()='Link 1'][2]"));
        act.moveToElement(thirdhover).click(click3).perform();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        act.moveToElement(thirdhover).click(click4).perform();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    
        WebElement Dontreleasmebx=driver.findElement(By.xpath("//div[@id='click-box']"));
        act.click(Dontreleasmebx).build().perform();
        act.clickAndHold(Dontreleasmebx).build().perform();
        
        driver.quit();
        
	}

}
