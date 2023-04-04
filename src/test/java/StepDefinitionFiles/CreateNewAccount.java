package StepDefinitionFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.driverFactory;
import io.cucumber.java.*;
import io.cucumber.java.en.*;



public class CreateNewAccount {
	WebDriver driver;
	
	@Given("User navigated to the sign up pape")
	public void user_navigated_to_the_sign_up_pape() throws InterruptedException {
		driver = driverFactory.getDriver();
		
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Create a new account")).click();
		Thread.sleep(1000);
		
	}

	@When("User enter first name {string}")
	public void user_enter_first_name(String firstNameText) throws InterruptedException {
		
		driver.findElement(By.id("user[first_name]")).sendKeys(firstNameText);
		Thread.sleep(1000);
	}

	@When("User enter last name {string}")
	public void user_enter_last_name(String lastNameText) throws InterruptedException {
		driver.findElement(By.id("user[last_name]")).sendKeys(lastNameText);
		Thread.sleep(1000);
	}

	@When("User enter email {string}")
	public void user_enter_email(String emailAddressText) throws InterruptedException {
		driver.findElement(By.id("user[email]")).sendKeys(emailAddressText);
		Thread.sleep(1000);
	}

	@When("User enter password {string}")
	public void user_enter_password(String passwordText) throws InterruptedException {
		driver.findElement(By.id("user[password]")).sendKeys(passwordText);
		Thread.sleep(1000);
	}

	@Then("User clicks on sign up button")
	public void user_clicks_on_sign_up_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();

	}

	@Then("User shold get a proper message")
	public void user_shold_get_a_proper_message() {
		System.out.println(">> Step Done");
	}

	@When("User do not enter first name")
	public void user_do_not_enter_first_name() {
		System.out.println(">> Step Done");
	}

	@When("User do not enter last name")
	public void user_do_not_enter_last_name() {
		System.out.println(">> Step Done");
	}

	@When("User do not enter email")
	public void user_do_not_enter_email() {
		System.out.println(">> Step Done");
	}

	@When("User do not enter password")
	public void user_do_not_enter_password() {
		System.out.println(">> Step Done");
	}
}
