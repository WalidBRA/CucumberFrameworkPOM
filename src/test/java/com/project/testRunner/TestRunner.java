package com.project.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "",
        features = "src/test/resources/features",
        glue = {"com/project/commonUtils", "com/project/stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/index.html", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"
        },
        monochrome = true
)

public class TestRunner {
}
