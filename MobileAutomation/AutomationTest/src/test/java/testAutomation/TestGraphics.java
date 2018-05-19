package testAutomation;

import mainAutomation.Graphics;
import org.testng.annotations.Test;

public class TestGraphics extends Graphics{

    @Test
    public void graphics(){
        clickGraphics();
        clickAlphaBitmap();
    }
}
