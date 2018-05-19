package testAutomation;

import mainAutomation.appPage;
import org.testng.annotations.Test;

public class TestappPage extends appPage {

    @Test
    public void setAlarm(){
        clickAlarm();
        System.out.println("TC1 passed");
    }
}
