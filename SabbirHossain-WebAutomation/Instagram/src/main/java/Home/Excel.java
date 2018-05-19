package Home;

import base.CommonAPI;

import java.io.IOException;
import java.util.ArrayList;

public class Excel extends CommonAPI {
    private ArrayList<String> list;

    public void excel() throws IOException {
        clickByXpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/p/a");
        clickByXpath("//*[@id=\"react-root\"]/section/footer/div/nav/ul/li[1]/a");
        clickByXpath("//*[@id=\"link_profile\"]/a/strong");

        ArrayList<String> searchAbleUsers = dataFromExcel("C:\\Users\\Sabbir Hossain\\eclipse-workspace\\Framwark-Automation-Team4\\Instagram\\Data\\ExcelFile.xls", "Sheet1", 0);
        ArrayList<String> searchAblePass = dataFromExcel("C:\\Users\\Sabbir Hossain\\eclipse-workspace\\Framwark-Automation-Team4\\Instagram\\Data\\ExcelFile.xls", "Sheet1", 1);
        for (int i = 1; i < searchAbleUsers.size(); i++) {
            typeByXpath("//input[@class='_ph6vk _jdqpn _o716c']", searchAbleUsers.get(i));
            typeByXpath("//input[@type='password']", searchAblePass.get(i));
        }
    }

    public ArrayList<String> dataFromExcel(String s, String sheet1, int i) {
        return list;
    }

}