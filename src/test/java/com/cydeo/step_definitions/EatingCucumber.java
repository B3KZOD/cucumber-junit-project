package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {

    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("Its from Given");
    }

    @When("he easts some cucumbers")
    public void he_easts_some_cucumbers() {
        System.out.println("Its from When");
    }

    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("Its from Then");
    }

    @Given("{string} is hungry")
    public void is_hungry(String name) {
        System.out.println("It is from string name parameter");
    }

    @When("he easts {int} cucumbers")
    public void he_easts_cucumbers(Integer count) {
        System.out.println("It is from int cucumber count");
    }

}
