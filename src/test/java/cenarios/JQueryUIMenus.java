package cenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.JQueryUIMenusPage;

public class JQueryUIMenus {
  WebDriver driver;
  JQueryUIMenusPage jQueryUIMenusPage;
  
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:/Users/dsilvafe/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    jQueryUIMenusPage = new JQueryUIMenusPage(driver);
    driver.manage().window().maximize();
  }
  
  @Test
  public void test() throws InterruptedException {
    jQueryUIMenusPage.clickCasoDeTeste();
  }
  
  @After
  public void encerra() {
    driver.close();
  }
}
