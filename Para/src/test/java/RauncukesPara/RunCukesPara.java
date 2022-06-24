package RauncukesPara;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeaturesPara", strict=true , glue="StepDefsPara", plugin = {"pretty","junit:target/JUnitReports/report.xml",
                "json:target/JSONReports/report.json",
                "html:target/HtmlReports", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class RunCukesPara {

}
