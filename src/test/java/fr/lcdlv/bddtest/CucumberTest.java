package fr.lcdlv.bddtest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "fr.lcdlv.bddtest"
)
public class CucumberTest {

}
