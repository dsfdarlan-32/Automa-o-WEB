package cenarios;

import org.junit.After;
import org.openqa.selenium.WebDriver;

import driver.Driver;

public class BaseTest {
  WebDriver driver = Driver.getDriver();
  
  @After
  public void encerra() {
    driver.close();
  }
}
