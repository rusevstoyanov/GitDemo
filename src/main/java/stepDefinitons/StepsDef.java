package stepDefinitons;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDef {
	@Given("^User navigate to home page$")
	public void user_navigate_to_home_page() throws Throwable {
	    System.out.println("sagh,mags");
	   
	}

	@When("^User click on topics button,topics dropdown should display$")
	public void user_click_on_topics_button_topics_dropdown_should_display() throws Throwable {
	    System.out.println("mincho");
	   
	}

	@Then("^User click on animals button$")
	public void user_click_on_animals_button() throws Throwable {
	    
	   System.out.println("Minchotrusg");
	}
}
