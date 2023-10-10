package managerUtilitis;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class StartApplication {

	 WindowsDriver driver;
	
	
	 @BeforeClass
	 public void startUp() throws IOException, InterruptedException  {
	     Desktop desktop=Desktop.getDesktop();
	     desktop.open(new File("C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe"));   
	     
	     // wait for open WinAppDriver
	     Thread.sleep(2000);
	     //TO set the desired capabilities
	     
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     capabilities.setCapability("platformName", "Windows");
	     capabilities.setCapability("platformVersion", "10");
	     capabilities.setCapability("app", "C:\\Users\\DELL\\AppData\\Local\\Postman\\Postman.exe");
	     //capabilities.setCapability("app", "C:\\Program Files\\Microsoft Power BI Desktop\\bin\\PBIDesktop.exe");
	     //capabilities.setCapability("app", "C:\\Windows\\system32\\notepad.exe");
	     //capabilities.setCapability("app","C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
	     
	     this.driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
	   
	     // applying the wait for over all script 
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     // Now you can retrieve and print the session ID
	     System.out.println(driver.getSessionId());
	 }
	 @Test
	 public void startApplication() {
		 System.out.println("The application has been started successfully...");
		 
	 }
	 
	 @AfterClass
	 public void closeUp() throws IOException {
		 Runtime.getRuntime().exec("taskkill /F /IM WinAppDriver.exe");
	 }
}
