package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    ChromeDriver chromeDriver;

    @BeforeMethod
    public void Setup() {
        // set update data
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();

    }
    @Test
    public void run() {
        System.out.println("hihi");
        chromeDriver.get("https://www.google.com.vn/?hl=vi");
        sleeps(5000);
    }
    @AfterMethod
    public void CleanUp() {
        System.out.println("hmhm");
        chromeDriver.quit();
    }

    private void sleeps(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
