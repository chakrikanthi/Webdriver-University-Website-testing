package WebdriverUniversityWebsitetesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class hiddenElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Main page is:"+driver.getTitle());
		WebElement HiddenElements=driver.findElement(By.xpath("//h1[text()='HIDDEN ELEMENTS']"));
		HiddenElements.click();
		Thread.sleep(1000);
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		System.out.println("Entered into new page:"+driver.getTitle());

		WebElement box1=driver.findElement(By.xpath("//div[@class='thumbnail']//h2[normalize-space()='Not Displayed']"));
		String text=box1.getText();
		System.out.println("First box title is:"+text);

		WebElement box2=driver.findElement(By.xpath("//h2[normalize-space()='Visibility Hidden']"));
		String text2=box2.getText();
		System.out.println("Second box title is:"+text2);

		WebElement button1=driver.findElement(By.xpath("//span[@id='button2']"));
		WebElement button1visibility=driver.findElement(By.xpath("//div[@class='section-title'][@id='visibility-hidden']"));
		String visibilitytxt=button1visibility.getAttribute("id");
		System.err.println("Button in box 2 is:"+visibilitytxt);

		String attribute=button1.getAttribute("data-toggle");
		System.out.println("data-toggle for the second box is:"+attribute);

		WebElement box3=driver.findElement(By.xpath("//h2[normalize-space()='Zero Opacity']"));
		String text3=box3.getText();
		System.out.println("Third box title is:"+text3);

		WebElement clickbox=driver.findElement(By.xpath("//span[@id='button3']"));
		Actions act= new Actions(driver);
		act.moveToElement(clickbox).click().perform();
		Thread.sleep(1000);

		WebElement popupbox=driver.findElement(By.xpath("//div[@id='myModalMoveClick']//div//div//div//p"));
		String popupboxtext= popupbox.getText();
		System.out.println("pop up window text message is:"+popupboxtext);

		driver.findElement(By.xpath("//div[@id='myModalMoveClick']//button[text()='Close']")).click();
		Thread.sleep(1000);
		System.out.println("The modal window got closed");




	}

}

/*output is:Main page is:WebDriverUniversity.com
Entered into new page:Hidden Elements
First box title is:Not Displayed
Second box title is:Visibility Hidden
Button in box 2 is:visibility-hidden
data-toggle for the second box is:modal
Third box title is:Zero Opacity
pop up window text message is:Advanced user interactions (API) has been developed to enable you to perform more complex interactions such as:
The modal window got closed
*/