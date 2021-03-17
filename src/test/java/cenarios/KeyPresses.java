package cenarios;

import java.awt.AWTException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.KeyPressesPage;

public class KeyPresses {
  WebDriver driver;
  KeyPressesPage keyPressesPage;
  
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:/Users/dsilvafe/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    keyPressesPage = new KeyPressesPage(driver);
    driver.manage().window().maximize();
  }
  
  @Test
  public void test() throws AWTException {
    keyPressesPage.clickCasoDeTeste();
  }
  
  @After
  public void encerra() {
    driver.close();
  }
}
