package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\default-cucumber-reports.html"},
        features="src/test/resources/features",
        glue="stepdefinitions",
        dryRun=false,
        tags = "@wip"

// dryRun = false olursa, testleri çalıştırır.
// dryRun = true  olursa, eksik olan methodları bulur ve size öneride bulunur.
)


public class Runner {


}
