package test;import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorAutomation {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "Windows"); // Add this line
        capabilities.setCapability("app", "C:\\Users\\DELL\\AppData\\Local\\Postman\\Postman.exe");
        capabilities.setCapability("ms:waitForAppLaunch", "true");

        WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);

        // Your automation code goes here

        driver.quit();
    }
}
