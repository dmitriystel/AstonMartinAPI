package com.runmylease.astonmartinsummitapi.test;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import com.runmylease.astonmartinsummitapi.data.ConfigDataManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    private Browser browser;

    @BeforeMethod
    public void initializeTestScenario() {
        browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(ConfigDataManager.getURL());
    }

    @AfterMethod
    public void finalizeTestScenario(){
        browser.quit();
    }
}
