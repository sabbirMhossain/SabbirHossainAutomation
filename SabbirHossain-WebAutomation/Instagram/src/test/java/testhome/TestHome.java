package testhome;

import Home.Home;
import org.testng.annotations.Test;

@Test
public class TestHome extends Home {
    public void test() throws InterruptedException {
        home();
    }
}