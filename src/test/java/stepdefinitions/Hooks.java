package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before//her  scenariodan once calisir,junitteki before,testng`deki beforemethod gibi
    public void setUp(){

    }


    @After//her  scenariodan sonra calisir,junitteki before,testng`deki beforemethod gibi
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();

    }
}
