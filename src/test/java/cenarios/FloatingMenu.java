package cenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FloatingMenuPage;

public class FloatingMenu {
  WebDriver driver;
  FloatingMenuPage floatingMenuPage;
  
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:/Users/dsilvafe/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    floatingMenuPage = new FloatingMenuPage(driver);
    driver.manage().window().maximize();
  }
  
  @Test
  public void test() {
    floatingMenuPage.clickCasoDeTeste();
    floatingMenuPage.clickMenu("Home");
    floatingMenuPage.clickMenu("News");
    floatingMenuPage.clickMenu("Contact");
  }
  
  @After
  public void encerra() {
    driver.close();
  }
}
