package iphone;

import org.testng.annotations.Test;
import pages.UiKitHome;
import report.TestLogger;

public class TestUiKitHome extends UiKitHome {
    @Test
    public void test1(){
        TestLogger.log("app is launched ...");
        clickBtns();
        System.out.println("btns clicked ...");
    }
}
