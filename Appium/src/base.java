import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
	DesiredCapabilities  d= new DesiredCapabilities ();
	d.setCapability(MobileCapabilityType.DEVICE_NAME, "iphone 8 plus");
	d.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
	
	d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
	d.setCapability(MobileCapabilityType.APP, "//Users//mohammadhasan//Desktop//UIKitCatalog.app");
	
	IOSDriver<IOSElement> driver= new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);
	
	
	
	
	
	
	}

}
