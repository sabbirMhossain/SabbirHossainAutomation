package pages;

import base.MobileAPI;
import org.openqa.selenium.WebElement;

public class Controls extends MobileAPI {
    public void clickBtns(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"AX error -25205\"])[4]");
        sleepFor(5);
    }
}

