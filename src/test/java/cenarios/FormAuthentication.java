package cenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FormAuthenticationPage;

public class FormAuthentication {
  WebDriver driver;
  FormAuthenticationPage formAuthenticationPage;
  
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:/Users/dsilvafe/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    formAuthenticationPage = new FormAuthenticationPage(driver);
    driver.manage().window().maximize();
  }
  
  @Test
  public void test() {
    formAuthenticationPage.clickCasoDeTeste();
  }
  
  @After
  public void encerra() {
    driver.close();
  }
}
