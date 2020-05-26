import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    @CucumberOptions(
            features = "src/test/java/features",
            glue = {"steps"},
            tags = {"~@Ignore"})
    public class TestRunner {
        private TestNGCucumberRunner testNGCucumberRunner;

        @BeforeClass(alwaysRun = true)
        public void setUpClass() {
            testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        }

        @Test(description = "Runs Cucumber Feature", dataProvider = "features")
        public void feature(CucumberFeatureWrapper cucumberFeature) {
            testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
        }

        @DataProvider
        public Object[][] features() {
            return testNGCucumberRunner.provideFeatures();
        }

        @AfterClass(alwaysRun = true)
        public void tearDownClass() {
            testNGCucumberRunner.finish();
        }
    }

