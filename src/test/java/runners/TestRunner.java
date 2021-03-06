package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\default-cucumber_reports.html",
                "json:target\\json-reports/cucumber.json",
                "junit:target\\xml-report/cucumber.xml" },
        features="src/test/resources/features",
        glue="dbStepdefinitions",
        dryRun=false,
        tags = " @wait"

// dryRun = false olursa, testleri çalıştırır.
// dryRun = true  olursa, eksik olan methodları bulur ve size öneride bulunur.
)


public class TestRunner {


}
