import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	@Test
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\GameCS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.marathishaadi.com/");

		WebElement element1 = driver.findElement(By.xpath("//button[@class='btn-primary form-control']"));
		element1.click();

		WebElement element2 = driver.findElement(By.xpath("//input[@name='email']"));
		element2.sendKeys("abc@gmail.com");

		Thread.sleep(5000);
		WebElement element3 = driver.findElement(By.xpath("//input[@name='password1']"));
		element3.sendKeys("12345678");

		WebElement element4 = driver.findElement(By.xpath("//div[@class='Dropdown-placeholder']"));
		element4.click();

		WebElement element5 = driver.findElement(By.xpath("//div[contains(text(),'Self')]"));
		element5.click();

		WebElement element6 = driver.findElement(By.xpath("//input[@id='gender_male']"));
		element6.click();

		WebElement element7 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-md btn-block']"));
		element7.click();

		String actual_value = driver.findElement(By.xpath("//div[contains(text(),'Marathi')]")).getText();
		String Expected_value = "Marathi";
		Assert.assertEquals(Expected_value, actual_value);
		System.out.println("**********Test completed**********");

	}

}
