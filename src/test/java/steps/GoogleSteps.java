package steps;

import cucumber.api.java.en.*;
import pages.GooglePage;



public class GoogleSteps {

   GooglePage google = new GooglePage();
    
@Given("^navego a Google$")
    public void navigateToGoogle (){
   google.navigateToGoogle();
    }

@And("^ingreso criterio de busqueda$")
    public void ingresoCriterio (){
        
    }
@When("^clickeo en boton de busqueda$")
    public void clickBoton (){
        
    }
@Then("^obtengo resultado$")
    public void resultadoBusqueda (){
        
    }
}
