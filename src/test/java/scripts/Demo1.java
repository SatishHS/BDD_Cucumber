package scripts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./FunctionalTestCase.feature",
glue=("Stepsdefinition"))

public class Demo1 {

}
