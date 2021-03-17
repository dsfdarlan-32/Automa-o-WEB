package cenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.MultipleWindowsPage;

public class MultipleWindows {
  WebDriver driver;
  MultipleWindowsPage multipleWindowsPage;
  
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:/Users/dsilvafe/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    multipleWindowsPage = new MultipleWindowsPage(driver);
    driver.manage().window().maximize();
  }
  
  @Test
  public void test() {
    multipleWindowsPage.clickCasoDeTeste();
  }
  
  @After
  public void encerra() {
    driver.quit();
  }
}
