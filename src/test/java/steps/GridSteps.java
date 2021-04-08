package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.GridPage;

public class GridSteps {

    GridPage grid = new GridPage();

    @Given("^I navigate to the static tables$")
    public void navigateToGrid(){
        grid.navigateToGrid();
    }

    @Then("^I can return the value I wanted$")
    public void returnValue(){
        String value = grid.getValueFromGrid(9,4);

        System.out.println(value);
    }
}
