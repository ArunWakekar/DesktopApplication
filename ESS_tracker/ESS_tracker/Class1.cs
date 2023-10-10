using System;
using OpenQA.Selenium.Appium;
using OpenQA.Selenium.Appium.Windows;

public class Class1
{
    public static void Main(string[] args)
    {
        DesiredCapabilities appCapabilities = new DesiredCapabilities();
        appCapabilities.SetCapability("app", "C:\\Windows\\system32\\notepad.exe");

        WindowsDriver<WindowsElement> driver = new WindowsDriver<WindowsElement>(new Uri("http://127.0.0.1:4723"), appCapabilities);

        try
        {
            driver.Manage().Window.Maximize();
            // Add your automation code here
            WindowsElement element = driver.FindElementByName("ButtonName");
            element.Click();
        }
        catch (Exception ex)
        {
            Console.WriteLine("An error occurred: " + ex.Message);
        }
        finally
        {
            driver.Quit();
        }
    }
}

