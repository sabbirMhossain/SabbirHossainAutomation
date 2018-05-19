package mainAutomation;

import base.MobileAPI;

public class appPage extends MobileAPI {
    public void clickApp(){ text("App").click(); }
    public void clickAlarm(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");
    }
}
