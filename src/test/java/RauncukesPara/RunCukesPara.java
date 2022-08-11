package RauncukesPara;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeaturesPara", strict=true , glue="StepDefsPara", plugin =  {"pretty","html:target/HtmlReports"}
		)
public class RunCukesPara {

}
