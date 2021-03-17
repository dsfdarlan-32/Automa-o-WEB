package cenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.NotificationMessagesPage;

public class NotificationMessages {
  WebDriver driver;
  NotificationMessagesPage notificationMessagesPage;
  
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:/Users/dsilvafe/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    notificationMessagesPage = new NotificationMessagesPage(driver);
    driver.manage().window().maximize();
  }
  
  @Test
  public void test() {
    notificationMessagesPage.clickCasoDeTeste();
  }
  
  @After
  public void encerra() {
    driver.close();
  }
}
