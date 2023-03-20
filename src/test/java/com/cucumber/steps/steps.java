package com.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	private WebDriver driver;
	
	@Given ("Currently in the login page of the actitime applicaion")
	public void curretly_in_the_login_page_of_the_actitime_applicaion() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\cucumber-Actitime\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	}
	
	@When ("I enter valid credentials")
	public void i_enter_valid_credentials() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	
	@Then ("I should see the overview page")
	public void I_should_see_the_overview_page() {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Users")).click();
	}
	
	@Then("I should be taken the userlist page")
	public void I_should_go_to_the_userlist_page() throws Exception{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='New User']")).click();
	}
	
	
	@Then("Enters user details {string} and {string} and {string}")
	public void user_enters_contact_details_and_and(String firstname, String lastname, String email) throws Exception{
		Thread.sleep(15000);
		 driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys(firstname);
		 driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys(lastname);
		 driver.findElement(By.id("createUserPanel_emailField")).sendKeys(email);
		 driver.findElement(By.xpath("//*[@id=\"createUserPanel\"]/div[3]/div/div[3]/div[1]")).click();
	}
	
	@Then("Successfully added the user")
	public void Successfully_added_the_user() throws Exception {
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"createUserPanel\"]/div[2]/div[1]/div[5]/span")).click();
	}
	@Then("Close the browser")
	public void close_the_browser() throws Exception{
		Thread.sleep(3000);
		driver.quit();
	}

}
