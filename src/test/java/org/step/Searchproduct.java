package org.step;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Searchproduct {
static WebDriver driver;
	
	@Given("user should able to launch miniinthebox homepage")
	public void user_can_able_to_launch_homepage() {
	    WebDriverManager.chromedriver().setup();
	    
	    driver = new ChromeDriver();
	    driver.get("https://www.miniinthebox.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }
	@When("user has to enter productname {string}")
	public void the_user_has_to_enter_productname(String product){
	    WebElement txtProduct=driver.findElement(By.id("keywords"));
	    txtProduct.sendKeys(product);
	}
	
	@When("user have to click the search button")
    public void user_have_to_click_the_search_button() {
		WebElement btnsearch=driver.findElement(By.xpath("//button[@class='search-button-new ctr-track ctr-track-show']"));
		btnsearch.click();
	}
	
	@Then("user have to click first item")
	  public void user_have_to_click_first_item() {
			WebElement btnitem=driver.findElement(By.id("8907855"));
			btnitem.click();
	}
	
}
	
