package WebdriverUniversityWebsitetesting;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccordiantxtAppearNDisappear {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String mainwindow= driver.getWindowHandle();
		System.out.println(mainwindow+driver.getTitle());
		
		WebElement ACCORDIONlink=driver.findElement(By.xpath("//h1[text()='ACCORDION & TEXT AFFECTS (APPEAR & DISAPPEAR)']"));
		ACCORDIONlink.click();
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		
		WebElement manualtestingtxt=driver.findElement(By.xpath("//button[@id='manual-testing-accordion']"));
		manualtestingtxt.click();
	    String manualtxt=manualtestingtxt.getText();
	    System.out.println(manualtxt);
	    
	    WebElement cucumber=driver.findElement(By.xpath("//button[@id='cucumber-accordion']"));
	    cucumber.click();
	    String cucumbertxt=cucumber.getText();
	    System.out.println(cucumbertxt);
	    
	    WebElement automation=driver.findElement(By.xpath("//button[@id='automation-accordion']"));
	    automation.click();
	    String automationtxt=automation.getText();
	    System.out.println(automationtxt);
	    
	    WebElement clickaccordion=driver.findElement(By.xpath("//button[@id='click-accordion']"));
	    clickaccordion.click();
	    String clickaccordiontxt=clickaccordion.getText();
	    System.out.println(clickaccordiontxt);
	    Thread.sleep(3000);
		
	    driver.quit();

	}

}
//output:F75B26876C0614A0071D96600EE8B129WebDriverUniversity.com
//Manual Testing
//Cucumber BDD
//Automation Testing
//Keep Clicking! - Text will Appear After 5 Seconds!
