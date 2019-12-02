import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
	DesiredCapabilities  d= new DesiredCapabilities ();
	d.setCapability("DEVICE_NAME","iphone 8 plus");
	d.setCapability("PLATFORM_NAME" ,"IOS");
	
	d.setCapability("platform version","13.2.2");
	d.setCapability(CapabilityType.BROWSER_NAME, "Safari");
	
	IOSDriver driver= new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), d);
	
	driver.get("http://google.com");
	
	
	
	
	
	}

}
