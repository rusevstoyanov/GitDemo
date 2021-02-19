package testRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/homePage.feature",
	tags = "@Covid",
	glue = "C:\\Users\\minch\\eclipse-workspace\\farmers\\src\\main\\java\\stepDefinitons",
	monochrome = false,
	plugin = {"json:target/RunCukes/cucumber.json"}
		)
public class TestRunnerClass {

}
