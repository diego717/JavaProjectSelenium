package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;



public class GoogleSteps {

   GooglePage google = new GooglePage();
@Given("navego a Google")
   public void navigateToGoogle (){
       google.navigateToGoogle();

    }

@And("^ingreso criterio de busqueda$")
    public void ingresoCriterio (){
        google.ingresoCriterio("google");
    }
@When("^clickeo en boton de busqueda$")
    public void clickBoton (){
        google.clickBoton();
        
    }
@Then("^obtengo resultado$")
    public void resultadoBusqueda (){
        
    }
}
