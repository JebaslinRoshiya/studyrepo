package study4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stu4 {
	
 WebDriver driver;
 @Given("Open the TestMe app Homepage")
 public void open_the_TestMe_app_Homepage() {
	 System.setProperty("webdriver.chrome.driver","C:\\arabi\\drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/");
	   driver.manage().window().maximize();
 }
 

 @When("Click the SignIn")
 public void click_the_SignIn() {
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
 }

 @Then("User enters the username {string}")
 public void user_enters_the_username(String x) {
	 driver.findElement(By.name("userName")).sendKeys(x);
 }

 @Then("User enters the password {string}")
 public void user_enters_the_password(String y) {
	 driver.findElement(By.name("password")).sendKeys(y);
 }

 @Then("User clicks login")
 public void user_clicks_login() {
	 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
 }
 @Then("Search {string} in the find details")
 public void search_in_the_find_details(String string) {
     driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
 }

 @Then("Click find Details")
 public void click_find_Details() {
     driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
 }

 @Then("Click the Add to Cart icon")
 public void click_the_Add_to_Cart_icon() {
    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
    Dimension cart=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getSize();
    if(cart!=null) {
    	Assert.assertTrue(true);
    	driver.close();
    }else
    {
    	Assert.assertTrue(false);
    }
 }
}
