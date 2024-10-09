package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://www.x5.ru/ru/")
    String getBaseUrl();

    @Key("browserName")
    @DefaultValue("chrome")
    String getBrowserName();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("browserVersion")
    @DefaultValue("129.0")
    String getBrowserVersion();

    @Key("remoteUrl")
    String getRemoteUrl();
}
