package mainAutomation;

import base.MobileAPI;
import org.openqa.selenium.By;

public class Content extends MobileAPI {
    public void clickContent(){
        text("Content").click();
    }
    public void clickAssets(){
        text("Assets").click(); }
}
