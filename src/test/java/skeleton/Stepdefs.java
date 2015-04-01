package skeleton;

import java.util.concurrent.TimeUnit;

import skeleton.Belly;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;

public class Stepdefs {
	Belly belly = new Belly();
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        
        belly.eat(cukes);
    }
    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //Belly belly = new Belly();
        belly.hours(arg1);
    }

    @Then("^my belly should have (\\d+) cukes and growl$")
    public void my_belly_should_growl(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    	//Belly belly = new Belly();
    	//int g = belly.size();
    	//TimeUnit.SECONDS.sleep(5);
    	Assert.assertEquals(arg1,belly.size());
    	
    	//return false;
    	
    }
}
