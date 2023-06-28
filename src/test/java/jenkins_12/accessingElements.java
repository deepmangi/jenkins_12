package jenkins_12;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.TypeOptions;
import com.microsoft.playwright.Playwright;
public class accessingElements {
	@Test
	public void Tutorialslogin() {
		
	Playwright playwright = Playwright.create(); 
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
    Page page = browser.newPage();
    page.navigate("https://tutorial.dev.radixweb.net/login");
    
    
    page.type("#uname","divyarajbhanushali@gmail.com", new TypeOptions().setDelay(50) );
    //value cannot be stored in page.type//can also add css selector as "[type=password]"
    //page.locator("#uname"/*can also be given as "id=uname"*/).type("divyarajbhanushali@gmail.com");//accessing email textbox using css selector
  
    
    page.locator("[id='upass']").type("divyaraj#143");
    //entering password //can also de done by copying selector in the inspect panel
    
    page.click("button:has-text('Login')");
    //page.click("#root > div > section > div > div > form > div.footer.text-center.pt-lg-4.pt-3 > button")//clicking on button;
    
    System.out.println(page.locator("//*[@id=\"root\"]/div[2]/div/div/section/div/h1").innerText());
    //innerText() will print the text in the given selector.
    
		}
}
