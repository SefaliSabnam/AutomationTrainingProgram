package selenium.basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {

	private static final Dimension Dimension = null;

	public static void main(String[] args) {
     
//     1. Launch the Browser window
	    WebDriver driver = new ChromeDriver();
	
//     2. Maximize the Browser window
	    driver.manage().window().maximize();
	    driver.manage().window().setSize(new Dimension(800,400));
	    
//     3. Delete all the Browser Cookies
	    driver.manage().deleteAllCookies();
	    
//     4. Enter URL and Launch the Application (https://www.google.com/)
	    driver.get("https://www.google.com/"); //it will wait until all elements are loading in the browser
	    
//     5. Verify the Application Title (Google)
	    String title = driver.getTitle();
	    if(title.equals("Google"))
	        System.out.println("Title is matching");
	    else
	    	System.out.println("Title is  not matching");	
	    
//     6. Navigate to Different Application (https://www.selenium.dev/)
	    driver.navigate().to("https://www.selenium.dev/"); //it won't wait until all elements are loading in the browser
	    
//     7. Go back to previous Application
	    driver.navigate().back();
	    
//     8. Move forward to next application
	    driver.navigate().forward();
	    
//     9. Refresh the application
	    driver.navigate().refresh();
	    
//     Get window name (unique window handle id)
	    String mainWindowId = driver.getWindowHandle();
	    System.out.println(mainWindowId);
	    
//    10.Launch new tab and launch the application in new tab (https://in.search.yahoo.com/)
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://in.search.yahoo.com/");
	    
//    11.Launch new window and launch the application in new window (https://parabank.parasoft.com/parabank/index.htm) 	
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	    
//    12.Switch back to main window	
	    driver.switchTo().window(mainWindowId);
	    
//    13.Get the size of window
	    System.out.println(driver.manage().window().getSize().getHeight());
	    System.out.println(driver.manage().window().getSize().getWidth());
	    
//    14.Close current window	
	    driver.close();
	    
//    15.Close all remaining windows		
		driver.quit();
	
	}

}
