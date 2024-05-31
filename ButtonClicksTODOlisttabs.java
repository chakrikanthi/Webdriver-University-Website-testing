package WebdriverUniversityWebsitetesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClicksTODOlisttabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//contact us
		String mainwindow= driver.getWindowHandle();
		System.out.println(mainwindow+driver.getTitle());
		
		WebElement ButtonClicks=driver.findElement(By.xpath("//h1[text()='BUTTON CLICKS']"));
		ButtonClicks.click();
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		
		//FIRST CLICK
		WebElement Click1=driver.findElement(By.xpath("//p[text()='CLICK ME!']"));
		Click1.click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//div[@class='modal fade in show']//button[text()='Close']")).click();

		//Second Click
		WebElement Click2=driver.findElement(By.xpath("//span[@id='button2']"));
		Click2.click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//div[@id='myModalJSClick']//button[@class='btn btn-default']")).click();
		
		//Third Click
		WebElement Click3=driver.findElement(By.xpath("//span[@id='button3']"));
		Click3.click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//div[@id='myModalMoveClick']//button[@class='btn btn-default']")).click();
        driver.close();
        
        //TO DO LIST LINK
        driver.switchTo().window(mainwindow);
        WebElement Todolistlink=driver.findElement(By.xpath("//h1[text()='TO DO LIST']"));
        Todolistlink.click();
        
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        WebElement  gotoposition=driver.findElement(By.xpath("//li[normalize-space()='Go to potion class']"));
        System.out.println(gotoposition.getText());
        gotoposition.click();
        
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        WebElement  Buynewrobes=driver.findElement(By.xpath("//li[normalize-space()='Buy new robes']"));
        System.out.println(Buynewrobes.getText());
        Buynewrobes.click();
        
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        WebElement  Practicemagic=driver.findElement(By.xpath("//li[normalize-space()='Practice magic']"));
        System.out.println(Practicemagic.getText());
        Practicemagic.click();
        
        WebElement addicon=driver.findElement(By.xpath("//i[@id='plus-icon']"));
        addicon.click();
        addicon.click();
        WebElement addtxtbox= driver.findElement(By.xpath(" //input[@placeholder='Add new todo']"));
        addtxtbox.sendKeys("Get kids Ready for school");
       
        driver.quit();
        
	}

}
/*
output:
	44C86DD286DFAB1AFC521832785D0987WebDriverUniversity.com
	Go to potion class
	Buy new robes
	Practice magic
*/