package config;


import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${deviceHost}.properties"
})
public interface EmulatorRealDeviceConfig extends Config {

    String deviceName();

    String platformVersion();

    String appPackage();

    String appActivity();

    String appiumServerUrl();
}
