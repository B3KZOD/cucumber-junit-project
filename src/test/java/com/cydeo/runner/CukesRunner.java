package com.cydeo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources/features", // feature is business layer
        glue = "com/cydeo/step_definitions",      // glue is implementation layer (layer for technical part)
        dryRun = false,
        tags = "@googleSearch", // it will run all @smoke tags scenarios
        publish = true

)
public class CukesRunner {
}
