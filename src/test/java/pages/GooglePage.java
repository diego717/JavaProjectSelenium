package pages;

public class GooglePage extends BasePage {
    private String searchButton = "//div[@class='tfB0Bf']//input[@name='btnK']";
    private String searchTextField = "//input[@name='q']";


    public GooglePage(){
        super(driver);
    }
    
    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }


    public void clickBoton(){
        clickElement(searchButton);
    }


    public void ingresoCriterio (String criteria) {

        write(searchTextField, criteria);
    }
}


