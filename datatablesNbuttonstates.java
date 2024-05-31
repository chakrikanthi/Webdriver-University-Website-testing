package WebdriverUniversityWebsitetesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datatablesNbuttonstates {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement datatablebtn=driver.findElement(By.xpath("//h1[text()='DATA, TABLES & BUTTON STATES']"));
		datatablebtn.click();
		Thread.sleep(1000);
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));

		List<WebElement>rowlist=driver.findElements(By.xpath("//table[@id='t01']//tr"));
		System.out.println("Number of rows in First table is:"+rowlist.size());
		for (WebElement webElement : rowlist) {
			System.out.println(webElement.getText());

		}
		List<WebElement> Firstname= driver.findElements(By.xpath("//table[@id='t01']//tr//td[1]"));
		System.out.println("First Name data:");
		for (WebElement webElement : Firstname) {
			System.out.println(webElement.getText());

		}
		
		List<WebElement> Lastname= driver.findElements(By.xpath("//table[@id='t01']//tr//td[2]"));
		System.out.println("Last Name data:");
		for (WebElement webElement : Lastname) {
			System.out.println(webElement.getText());

		}

		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='t01']//tr//td[3]"));
		System.out.println("Age data:");
		for (WebElement webElement : rows) {
			System.out.println(webElement.getText());

		}

		List<WebElement>Secondtablerowlist=driver.findElements(By.xpath("//table[@id='t02']//tr"));
		System.out.println("Number of rows in second table is:"+rowlist.size());
		for (WebElement webElement : Secondtablerowlist) {
			System.out.println(webElement.getText());

		}
		List<WebElement> Firstname2= driver.findElements(By.xpath("//table[@id='t02']//tr//td[1]"));
		System.out.println("First Name data:");
		for (WebElement webElement : Firstname2) {
			System.out.println(webElement.getText());

		}
		
		List<WebElement> Lastname2= driver.findElements(By.xpath("//table[@id='t02']//tr//td[2]"));
		System.out.println("Last Name data:");
		for (WebElement webElement : Lastname2) {
			System.out.println(webElement.getText());

		}

		List<WebElement> rows2= driver.findElements(By.xpath("//table[@id='t02']//tr//td[3]"));
		System.out.println("Age data:");
		for (WebElement webElement : rows2) {
			System.out.println(webElement.getText());

		}
       driver.findElement(By.xpath("//form[@id='form-textfield']//input[@name='firstname']")).sendKeys("sat");
       driver.findElement(By.xpath("//form[@id='form-textfield']//input[@name='lastname']")).sendKeys("reddy");
       driver.findElement(By.xpath("//form[@id='form-textfield']//textarea")).sendKeys("This area is for text testing");

       
       //Badges
       WebElement Todaysdeal= driver.findElement(By.xpath("//span[normalize-space()='5']"));
       System.out.println("Todays deals are:"+Todaysdeal.getText());
       WebElement Allprdcts=driver.findElement(By.xpath("//span[normalize-space()='20']"));
       System.out.println("All products are:"+Allprdcts.getText());
       
       //Table

		List<WebElement> Tablerows= driver.findElements(By.xpath("//table[@class='table table-light traversal-table']//tr"));
		System.out.println("Table rows are:"+Tablerows.size());
		for (WebElement webElement : Tablerows) {
			System.out.println(webElement.getText());

		}
		
		List<WebElement> firstnamerows= driver.findElements(By.xpath("//table[@class='table table-light traversal-table']//td[1]"));
		System.out.println("Firstname rows are:"+firstnamerows.size());
		for (WebElement webElement : firstnamerows) {
			System.out.println(webElement.getText());

		}
		
		List<WebElement> lastnamerows= driver.findElements(By.xpath("//table[@class='table table-light traversal-table']//td[2]"));
		System.out.println("lastname rows are:"+lastnamerows.size());
		for (WebElement webElement : lastnamerows) {
			System.out.println(webElement.getText());

		}
		
		//Lists
		//drinks
		List<WebElement> numberofdrinks= driver.findElements(By.xpath("//ul[@class='traversal-drinks-list']//li"));
		System.out.println("Total number of drinks are:"+numberofdrinks.size());
		for (WebElement webElement : numberofdrinks) {
			System.out.println(webElement.getText());

		}
		//Fruits n vegetables
		List<WebElement> numberoffruitsNveg= driver.findElements(By.xpath("//ul[@class='traversal-food-list']//li"));
		System.out.println("Total number of fruits and veggies are:"+numberoffruitsNveg.size());
		for (WebElement webElement : numberoffruitsNveg) {
			System.out.println(webElement.getText());

		}
		
		//Types of jobs
		List<WebElement> Typesofjobs= driver.findElements(By.xpath("//ul[@class='menu']//li"));
		System.out.println("Total Types of jobs are:"+Typesofjobs.size());
		for (WebElement webElement : Typesofjobs) {
			System.out.println(webElement.getText());
        driver.quit();
		}
	}

}
/*output:
Number of rows in First table is:4
Firstname Lastname Age
John Smith 45
Jemma Jackson 94
Michael Doe 20
First Name data:
John
Jemma
Michael
Last Name data:
Smith
Jackson
Doe
Age data:
45
94
20
Number of rows in second table is:4
Firstname Lastname Age
Jason Jones 27
Sarah Jackson 56
Bob Woods 80
First Name data:
Jason
Sarah
Bob
Last Name data:
Jones
Jackson
Woods
Age data:
27
56
80
Todays deals are:5
All products are:20
Table rows are:4
# First Last
1 Andy Otto
2 Jacob Jones
3 Larry Scott
Firstname rows are:3
Andy
Jacob
Larry
lastname rows are:3
Otto
Jones
Scott
Total number of drinks are:5
Coffee
Tea
Milk
Espresso
Sugar
Total number of fruits and veggies are:11
Fruits
Apple
Banana
Blackberries
Cherries
Figs
Vegetables
Asparagus
Broccoli
Kidney beans
Lentils
Total Types of jobs are:3
Finance
Technology
Sales
*/