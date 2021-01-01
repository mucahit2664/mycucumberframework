package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\default-cucumber_reports1.html",
                "json:target\\json-reports/cucumber1.json",
                "junit:target\\xml-report/cucumber1.xml" },
        features="src/test/resources/features",
        glue="stepdefinitions",
        dryRun=false,
        tags = "@smoke"

// dryRun = false olursa, testleri çalıştırır.
// dryRun = true  olursa, eksik olan methodları bulur ve size öneride bulunur.
)


public class SmokeTestRunner {

}
