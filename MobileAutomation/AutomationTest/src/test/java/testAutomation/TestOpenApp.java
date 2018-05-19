package testAutomation;

import mainAutomation.OpenApp;
import org.testng.annotations.Test;

public class TestOpenApp extends OpenApp{

    @Test
    public void appIsOpen(){
        openApp();
    }
}
