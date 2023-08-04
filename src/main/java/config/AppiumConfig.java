package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumConfig {

    public static AppiumDriver<MobileElement> driver;

    /*
{
  "platformName": "Android",
  "deviceName": "Nex6",
  "platformVersion": "8.0",
  "appPackage": "com.telran.ilcarro",
  "appActivity": ".SplashActivity"
}
     */

    @BeforeSuite
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Nexus5");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        capabilities.setCapability("appPackage", "com.telran.ilcarro");
        capabilities.setCapability("appActivity", ".SplashActivity");


        capabilities.setCapability("app", "C:\\Tools\\ilcarro-android.apk");
        try {
            driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
