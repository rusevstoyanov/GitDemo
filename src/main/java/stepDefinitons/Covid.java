package stepDefinitons;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Covid {

@Given("^User navigate to homePage$")
public void user_navigate_to_homePage() throws Throwable {
    System.out.println("try and catch");
    System.out.println("hello world");
    System.out.println("hello asgfworld");
    System.out.println("heasdfllo world");
    System.out.println("hello wasgaorld");
    System.out.println("hello world");
}

@When("^User click on topics button,dropdown menu should display$")
public void user_click_on_topics_button_dropdown_menu_should_display() throws Throwable {
    System.out.println("hello world");
    System.out.println("hello sfasforld");
    System.out.println("hello woasfasfrld");
}

@Then("^User click on coronavirus button$")
public void user_click_on_coronavirus_button() throws Throwable {
   System.out.println("always like that");
}
}
