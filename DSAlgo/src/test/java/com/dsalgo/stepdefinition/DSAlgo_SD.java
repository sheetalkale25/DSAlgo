package com.dsalgo.stepdefinition;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSAlgo_SD {

	static WebDriver driver;
@Given("The user is on Home page after logged in")
public void the_user_is_on_home_page_after_logged_in() {
   driver= new ChromeDriver();
   driver.get("https://dsportalapp.herokuapp.com/");
  
}

@When("The user clicks the Getting Started button in Queue page")
public void the_user_clicks_the_getting_started_button_in_queue_page() {
   
   
}

@Then("The user should be directed to Queue page")
public void the_user_should_be_directed_to_queue_page() {
   
   
}

@Then("Close browser")
public void close_browser() {
   
   
}

@When("user is on Queue page")
public void user_is_on_queue_page() {
   
   
}

@When("user clicks on Implementation of Queue in Python link")
public void user_clicks_on_implementation_of_queue_in_python_link() {
   
   
}

@Then("user should navigate to Implimentaion of Queue in Python page")
public void user_should_navigate_to_implimentaion_of_queue_in_python_page() {
   
   
}

@When("user is on Implimentaion of Queue in Python page")
public void user_is_on_implimentaion_of_queue_in_python_page() {
   
   
}

@When("user clicks on button Try here")
public void user_clicks_on_button_try_here() {
   
   
}

@Then("user is navigated to a page having TryEditor with a Run button")
public void user_is_navigated_to_a_page_having_try_editor_with_a_run_button() {
   
   
}

@When("user clicks on Implementation using collections.deque link")
public void user_clicks_on_implementation_using_collections_deque_link() {
   
   
}

@Then("user should navigate to Implementation using collections.deque page")
public void user_should_navigate_to_implementation_using_collections_deque_page() {
   
   
}

@When("user is on Implementation using collections.deque page")
public void user_is_on_implementation_using_collections_deque_page() {
   
   
}

@When("user clicks on button Try here on collections.deque page")
public void user_clicks_on_button_try_here_on_collections_deque_page() {
   
   
}

@When("user clicks on Implementation using array link")
public void user_clicks_on_implementation_using_array_link() {
   
   
}

@Then("user should navigate to Implementation using array page")
public void user_should_navigate_to_implementation_using_array_page() {
   
   
}

@When("user is on Implementation using array page")
public void user_is_on_implementation_using_array_page() {
   
   
}

@When("user clicks on button Try here on Implementation using array page")
public void user_clicks_on_button_try_here_on_implementation_using_array_page() {
   
   
}

@When("user clicks on Queue Operations link")
public void user_clicks_on_queue_operations_link() {
   
   
}

@Then("user should navigate to Queue Operations page")
public void user_should_navigate_to_queue_operations_page() {
   
   
}

@When("user is on Queue Operations page")
public void user_is_on_queue_operations_page() {
   
   
}

@When("user clicks on button Try here on Queue Operations page")
public void user_clicks_on_button_try_here_on_queue_operations_page() {
   
   
}

@When("user clicks on Practice Questions link")
public void user_clicks_on_practice_questions_link() {
   
   
}

@Then("user should navigate to Practice Questions page")
public void user_should_navigate_to_practice_questions_page() {
   
   
}



}
