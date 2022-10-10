package com.test.weborder.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
These are Interview Questions:
->Runner class is a way to run all feature files from here.(xml in TESTING)
Regression, Smoke, Integration... etc.
-->@RunWith -->comes form Junit and executes the feature file steps
-->CucumberOptions-->special annotation that have some keywords
-->features-->the location of feature files(should be content root)
-->glue-->the location of step definitions files(should be source root)
-->dryRun-->a way to get snips(steps) without executing the whole implementation
-->tags-->a way to specialize scenarios for specific purposes, meaning
you can run some scenarios for only regression or smoke or etc.
-->plugin-->a way to integrate specific condition for the keyword, mostly
used to create a report card.

 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/weborder",
        glue = "com/test/weborder/stepdefinitions",
        dryRun = false,
        tags = "@regression",//OR "@ahmet or @mehmet" OR "@smoke and @ahmet and not @mehmet"
        plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class WebOrderRunner {

}
