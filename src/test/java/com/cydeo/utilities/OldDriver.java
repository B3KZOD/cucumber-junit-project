package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OldDriver {
    // Creating a private constructor, so we are closing
    // access to the object of this class from outside class
//    private Driver() {}


    // We make WebDriver private, because we want to close access from outside class.
    // We make it static because we will use it in a static method
    private static WebDriver driver; // value is null by default


    //Create a re-usable utility method which will return same driver instance when we call it
    public static WebDriver getDriver() {

        // it will check if driver is null and if it is we will set up browser from outside of class
        // if you already set up driver and using it again for following line of codes, it will return to same driver
        if (driver == null) {

            // We read our browserType from configuration.properties.
            // This way, we can control which browser is opened from outside our code, from configuration.properties
            // help of ConfigurationReader class getProperty method()
            String browserType = ConfigurationReader.getProperty("browser");

            // Depending on the browserType that will be return from configuration.properties file switch statement will determine the case, and open the matching browser
            switch (browserType.toLowerCase()) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
//                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
//                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }
        }

        return driver;
    }

    //This method will make sure our driver value is always null after using quit() method
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();  // this line will terminate the existing sessions. value will not even be null
            driver = null;
        }
    }

}
