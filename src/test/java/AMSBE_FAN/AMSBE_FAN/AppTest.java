package AMSBE_FAN.AMSBE_FAN;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Unit test for simple App.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/RegisterCustomer.feature" ,
		format = {"pretty", "html:target/Reports.txt"}
		)
public class AppTest {
	
}