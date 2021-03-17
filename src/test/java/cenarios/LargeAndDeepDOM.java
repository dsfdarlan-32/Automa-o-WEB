package cenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LargeAndDeepDOMPage;

public class LargeAndDeepDOM {
  WebDriver driver;
  LargeAndDeepDOMPage largeAndDeepDOMPage;
  
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C://Users/dsilvafe/chromedriver_win32/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    largeAndDeepDOMPage = new LargeAndDeepDOMPage(driver);
    driver.manage().window().maximize();
  }
  
  @Test
  public void test() {
    largeAndDeepDOMPage.clickCasoDeTeste();
  }
  
  @After
  public void encerra() {
    driver.close();
  }
}
