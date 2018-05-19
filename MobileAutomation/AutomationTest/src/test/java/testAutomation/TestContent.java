package testAutomation;

import mainAutomation.Content;
import org.testng.annotations.Test;

public class TestContent extends Content {

    @Test
    public void contentPage(){
        clickContent();
        clickAssets();
    }
}
