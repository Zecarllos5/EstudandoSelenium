package com.saucedemo.factory;

import com.google.common.io.Resources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

    public static WebDriver createWebDriver(String browser){

        switch (browser){
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", Resources.getResource("drivers/chromedriver.exe").getPath());
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                ChromeDriver webDriver = new ChromeDriver(options);
                return webDriver;

            default:
                return null;
        }

    }

}
