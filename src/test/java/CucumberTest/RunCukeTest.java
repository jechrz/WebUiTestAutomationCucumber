package CucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\Features" ,
        glue = {"classpath:com.jechrz.defs", "classpath:com.jechrz.defs0"} ,
        monochrome = true,
        strict = true
        //tags = {"@tag1", "@tag2"}
)

public class RunCukeTest {
}
