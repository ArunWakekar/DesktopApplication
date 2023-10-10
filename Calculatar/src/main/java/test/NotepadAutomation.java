package test;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.windows.WindowsDriver;
public class NotepadAutomation {
public static void main(String[] args) throws Exception{
	
	//open the winApp programmatically..
	
	Desktop desktop=Desktop.getDesktop();
	desktop.open(new File("C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe"));	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("platformName", "Windows");
	capabilities.setCapability("platformVersion", "10");
    capabilities.setCapability("app", "Microsoft.WindowsMaps_8wekyb3d8bbwe!App");
	//capabilities.setCapability("app","C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
	//capabilities.setCapability("app", "C:\\Program Files\\Microsoft Office\\root\\Office16\\lync.exe");
	  WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
		/*
		 * driver.findElementByAccessibilityId("msotcidPlaceOfficeStart").click();
		 * driver.findElementByClassName("Blank workbook").click();
		 *driver.findElementByAccessibilityId("A1").sendKeys("Arun Wakekar");
	  	*/
	  
		/*
		 * Thread.sleep(3000);
		 * driver.findElementByAccessibilityId("LogInButton").click();
		 * driver.findElementByAccessibilityId("TextBox").sendKeys("8698615947");
		 * driver.findElementByAccessibilityId("EmailContinueButton").click();
		 * NotepadAutomation.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 * 
		 */
	  Runtime.getRuntime().exec("taskkill /F /IM WinAppDriver.exe");
	}
}