package steps;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.AfterStep;
import cucumber.api.java.BeforeStep;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepeLearning{
	public static WebDriver driver;

	@BeforeStep
	 public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GayatriKerakalamatti\\Documents\\SDET training\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	}

	@AfterStep
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] Bytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(Bytes,"image/png");
		}
		driver.close();
		driver.quit();
	}

	@Given("User navigate to {string}")
	public void user_navigate_to(String url) {
		driver.get(url);
	}

	@When("User click on SignUp")
	public void user_click_on_SignUp() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign up!')]")).click();
	}

	@Then("User entered {string} firstname")
	public void user_entered_firstname(String firstname) {
	    driver.findElement(By.id("registration_firstname")).sendKeys(firstname);
	}

	@And("User entered {string} lastname")
	public void user_entered_lastname(String lastname) {
	    driver.findElement(By.id("registration_lastname")).sendKeys(lastname);
	}

	@And("User entered {string} email")
	public void user_entered_email(String email) {
	    driver.findElement(By.id("registration_email")).sendKeys(email);
	}
	
	@And("User entered {string} username")
	public void user_entered_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("User entered {string} password")
	public void user_entered_password(String password) {
		 driver.findElement(By.id("pass1")).sendKeys(password);
	}

	@And("User confirms {string} Conf password")
	public void user_confirms_Conf_password(String password1) {
		 driver.findElement(By.id("pass2")).sendKeys(password1);
	}

	@And("User clicks on Register button")
	public void user_clicks_on_Register_button() {
	    driver.findElement(By.id("registration_submit")).click();
	}



	@Then("User validates the name")

	public void user_validates_the_name(String docString) {

	    String actualMessage = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]")).getText();
	    Assert.assertEquals(docString, actualMessage);
	}

	@Then("User clicks on HomePage")
	public void user_clicks_on_HomePage() {
	    driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[1]/a")).click();

	}

	@And("Verify {string} email from profile section")

	public void verify_email_from_profile_section(String email) {
		//click on profile to check email
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	    String actualEmail = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p")).getText();
	    Assert.assertEquals(email, actualEmail);
	}

	@And("Compose email and send to {string}")

	public void compose_email_and_send_to(String SenderEmail) throws InterruptedException {

	    driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[2]/a")).click();

	    driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys(SenderEmail);

	    Thread.sleep(1000);

	    driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys(Keys.ENTER);

	    driver.findElement(By.xpath("//*[@id=\"compose_message_title\"]")).sendKeys("Greetings");

	    driver.findElement(By.xpath("/html/body")).sendKeys("Merry Christmas");

	    driver.findElement(By.id("compose_message_compose")).click();

	}



	@And("Verify the message {string}")
	public void verify_the_message(String message) {
		String confirMessage = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[1]")).getText();
		Assert.assertEquals(message, confirMessage);


	}













}