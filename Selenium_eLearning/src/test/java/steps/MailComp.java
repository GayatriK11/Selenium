package steps;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;



public class MailComp {

	

	WebDriver driver;

	

	By homepage = By.xpath("//*[@id=\"navbar\"]/ul[1]/li[1]/a");

	

	By profile = By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a");

	

	By mail = By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p");

	

	By compose = By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[2]/a");

	

	By recp = By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input");

	

	By Enter = By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input");

	

	By mtitle = By.xpath("//*[@id=\"compose_message_title\"]");

	

	By mbody = By.xpath("/html/body");

	

	By send = By.xpath("//*[@id=\"compose_message_compose\"]");

	

	By confmsg = By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[1]");

	

	public MailComp(WebDriver driver) {

		this.driver = driver;

	}

	

	//user clicks on Hompage

	public void HomePage() {

		driver.findElement(homepage).click();

	}

	//User clicks on profile

	public void profile() {

		driver.findElement(profile).click();

	}

	//User verifies mail

	public String mailveri() {

		return driver.findElement(mail).getText();

	}

	//User clicks on Compose

	public void Compose() {

		driver.findElement(compose).click();

	}

	//user enters recipient's name

	public void recipient(String recpname) {

		driver.findElement(recp).sendKeys(recpname);

	}

	//press Enter

	public void enter() {

		driver.findElement(Enter).sendKeys(Keys.ENTER);

	}

	//user enters Mail Subject

	public void messagetitile() {

		driver.findElement(mtitle).sendKeys("Hi For Testing");

	}

	//user enters mail body

	public void mailbody() {

		driver.findElement(mbody).sendKeys("Hello Mr.Naveen,\r\n%%%This is for Testing\r\n\r\nFrom,\r\nRitabrata Ghosh");

	}

	//user clicks on send button

	public void sendClick() {

		driver.findElement(send).click();

	}

	//User verifies message after sending

	public String messagveri() {

		return driver.findElement(confmsg).getText();

	}



}