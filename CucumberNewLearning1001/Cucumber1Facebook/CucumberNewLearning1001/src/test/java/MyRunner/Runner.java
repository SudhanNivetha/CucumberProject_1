package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/User/Desktop/Documents Folder/SeleniumLearning/CucumberNewLearning1001/src/test/java/featureFile/fileFeature.feature"
		,glue={"stepDefinitionPack"}
		,dryRun=false ,
		format={"pretty" ,"html:test-output"} 
		 )
public class Runner {

}
