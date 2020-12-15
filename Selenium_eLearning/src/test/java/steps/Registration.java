package steps;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;



public class Registration {



	

	WebDriver driver;



    By signup = By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a");



    By firstname = By.xpath("//*[@id=\"registration_firstname\"]");

    

    By lastname = By.xpath("//*[@id=\"registration_lastname\"]");



    By email =By.xpath("//*[@id=\"registration_email\"]");



    By username = By.xpath("//*[@id=\"username\"]");

    

    By password = By.xpath("//*[@id=\"pass1\"]");

    

    By Confpass = By.xpath("//*[@id=\"pass2\"]");

    

    By regbutt = By.xpath("//*[@id=\"registration_submit\"]");

    

    By message = By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]");



    public Registration(WebDriver driver){



        this.driver = driver;

    }

    

    //Click on Signup button

       public void clickSignup( ) {

    	   driver.findElement(signup).click();

       }

   //User enters first name

       public void firstname(String fname ) {

    	   driver.findElement(firstname).sendKeys(fname);

       }

   //User enters last name

       public void lastname(String lname) {

    	   driver.findElement(lastname).sendKeys(lname);

       }

   //User enters enters email

       public void email(String emaiil) {

    	   driver.findElement(email).sendKeys(emaiil);

       }

   //User enters username

       public void username(String uname) {

    	   driver.findElement(username).sendKeys(uname);

       }

   // User enters password

       public void password(String pass) {

    	   driver.findElement(password).sendKeys(pass);

       }

   //User enters confirms password

       public void confpassword(String confpass) {

    	   driver.findElement(Confpass).sendKeys(confpass);

       }

   //User clicks on register button

       public void regbutton() {

    	   

    	   driver.findElement(regbutt).click();

       }

   //User validates name and message

       public String nameveri() {

    	   return driver.findElement(message).getText();

       }

       

}