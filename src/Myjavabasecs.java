import java.sql.Driver;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myjavabasecs {
	WebDriver driver = new ChromeDriver();
	String URL = "https://magento.softwaretestingboard.com/";

	@BeforeTest

	public void Mysetup() {
		driver.get(URL);
		driver.manage().window().maximize();

	}

	@Test
	public void MyfirstTest() throws InterruptedException {

		driver.findElement(By.linkText("Sign In")).click();

		driver.findElement(By.linkText("Create an Account")).click();

		Thread.sleep(300);

		WebElement theforrrm = driver.findElement(By.id("form-validate"));

		List<WebElement> inputfields = theforrrm.findElements(By.tagName("input"));

		System.out.println("the number of input" + inputfields.size());
		for (int i = 0; i < inputfields.size(); i++) {

			if (inputfields.get(i).getAttribute("type").equals("hidden")) {
				continue;
			} else {

				inputfields.get(i).sendKeys("Ahmad");
			}
		}

	}

	@Test()

	public void secondtest() throws InterruptedException {

		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);

		WebElement allitems = driver.findElement(By.xpath("(//div[@class='products-grid grid'])[1]"));

		List<WebElement> items = allitems.findElements(By.tagName("li"));
		Random rand = new Random();

		int randomindex = rand.nextInt(items.size());
		items.get(randomindex).click();

		for (int i = 0; i < items.size(); i++) {

		}

	}

}
