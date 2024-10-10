package tests;

import com.codeborne.selenide.Configuration;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Configuration.remote;

public class WebDriverProvider {

    private final WebConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebConfig.class, System.getProperties());
        createDriver();
    }

    public void createDriver() {
        if (config.getBrowserName().equalsIgnoreCase("chrome")) {
            Configuration.browser = "chrome";
        }
        if (config.getBrowserName().equalsIgnoreCase("firefox")) {
            Configuration.browser = "firefox";
        }

        Configuration.baseUrl = config.getBaseUrl();
        remote = config.getRemoteUrl();
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.pageLoadTimeout = 100000;
        Configuration.timeout = 15000;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true));

        Configuration.browserCapabilities = capabilities;
    }
}