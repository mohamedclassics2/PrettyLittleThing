package com.PrettyLittleThing.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        features = "src/test/resources/features/",
        glue = "com/PrettyLittleThing/stepDefinitions",
        dryRun = false,
        strict = true,
        tags = "@wip"
)
public class CukesRunner {
}
