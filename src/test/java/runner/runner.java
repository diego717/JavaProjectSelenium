package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class) 
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps"
)

public class runner {

    
}