package task;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EvalutionTask {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://openrouter.ai/chat?models=nvidia/nemotron-nano-9b-v2:free");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fis1 = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		Properties configProperties = new Properties();
		configProperties.load(fis1);

		String rawText = configProperties.getProperty("text") + configProperties.getProperty("text2");

		String evaluationText = configProperties.getProperty("text3");

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='identifier-field']")).sendKeys("rufasborugadda@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-localization-key='formButtonPrimary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("Rufasrebel@1997");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-localization-key='formButtonPrimary']")).click();
		Thread.sleep(2000);

		WebElement openRouterChatBox = driver.findElement(
				By.xpath("//div[@class='relative']/div[2]//div/div/textarea[@placeholder='Start a new message...']"));
		openRouterChatBox.click();
		Thread.sleep(3000);
		openRouterChatBox.sendKeys(rawText);
		Thread.sleep(10000);
		openRouterChatBox.sendKeys(Keys.ENTER);
		Thread.sleep(10000);

		openRouterChatBox.click();
		Thread.sleep(5000);
		openRouterChatBox.sendKeys(evaluationText);
		Thread.sleep(10000);
		openRouterChatBox.sendKeys(Keys.ENTER);
		Thread.sleep(15000);
		WebElement outputTextarea = driver
				.findElement(By.xpath("//div[@class='flex flex-col items-start gap-2 w-full']/div/div/div/p"));
		Thread.sleep(5000);
		String outputFormatText = outputTextarea.getText();
		System.out.println(outputFormatText);

		System.out.println("--- SOURCE_TEXT START ---");
		System.out.println("Input Original Text :" + configProperties.getProperty("text"));
		System.out.println("--- SOURCE_TEXT END ---");
		
		System.out.println("--- QB_SUMMARY START ---");
		System.out.println("Qb Su2mmary Text : " + configProperties.getProperty("text2"));
		System.out.println("--- QB_SUMMARY END ---");

		driver.quit();

	}

}
