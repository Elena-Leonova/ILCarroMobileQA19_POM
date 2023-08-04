package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashPage extends BasePage{
    public SplashPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
//resource-id
    //com.telran.ilcarro:id/versionText

    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/versionText']")
    MobileElement androidWidgetTextView;

    String versionOnPage = "Version 1.0.0";

    public boolean validateVersionDisplaysCorrect(){
        return false;
    }


}
