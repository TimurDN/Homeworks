package com.telerikacademy.testframework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class UserActionNonImplemented {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserActionNonImplemented.class);
    private final Driver driver;
    public static WebDriverWait wait;

    public UserActionNonImplemented(Driver driver) {
        this.driver = driver;
    }

    public void hoverElement(String key, Object... arguments) {
        // TODO: Implement the method
        // 1. Get locator value from properties by key
        // 2. Add Log entry for the action to be performed
        // 3. Perform a hover Action
    }

    public void switchToIFrame(String iframe) {

        // Get iframe locator value from properties by key
        Properties uiMappings = PropertiesManager.PropertiesManagerEnum.INSTANCE.getUiMappings();
        String iframeLocator = uiMappings.getProperty(iframe);

        // Add Log entry for the action to be performed
        LOGGER.info("Switching to iframe with key: " + iframe);

        // Switch to the frame
        driver.switchTo().frame(iframeLocator);
    }

    public boolean isElementPresent(String locator, Object... arguments) {
        // TODO: Implement the method
        // 1. Get default timeout from properties
        // 2. Initialize Wait utility
        // 3. Try to wait for element present
        // 4. return true/false if the element is/not present
        return true;
    }

    public boolean isElementVisible(String locator, Object... arguments) {
        // TODO: Implement the method
        // 1. Get default timeout from properties
        // 2. Initialize Wait utility
        // 3. Try to wait for element visible
        // 4. return true/false if the element is/not visible
        return true;
    }

    public void waitFor(long timeOutMilliseconds) {
        try {
            Thread.sleep(timeOutMilliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //############# ASSERTS #########
    public void assertNavigatedUrl(String urlKey) {
        // TODO: Implement the method
        // 1. Get Current URL
        // 2. Get expected url by urlKey from Properties
    }

    public void pressKey(Keys key) {
        // TODO: Implement the method
        // 1. Initialize Actions
        // 2. Perform key press
    }

    public String getElementAttribute(String locator, String attributeName) {
        // TODO: Implement the method
        // 1. Find Element using the locator value from Properties
        // 2. Get the element attribute
        // 3. Return the expected value
        return "";
    }
}
