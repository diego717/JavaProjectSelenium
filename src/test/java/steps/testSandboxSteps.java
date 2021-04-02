package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.TestSandBox;

public class testSandboxSteps {
    TestSandBox sandboxPage = new TestSandBox();

    @Given("^ingreso a pagina Web con sandbox$")
    public void navigateToTheSandBoxSite(){
        sandboxPage.navigateToSandbox();

    }
    @And("^selecciono valor en dropdown$")
    public void selectState(){
        sandboxPage.selectCategory("Manual");
    }

}