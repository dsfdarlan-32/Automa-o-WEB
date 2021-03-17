package pages;

import org.openqa.selenium.WebDriver;

import maps.NotificationMessagesMaps;

public class NotificationMessagesPage {
  private WebDriver driver;
  NotificationMessagesMaps notificationMessagesMaps;
  
  public NotificationMessagesPage(WebDriver driver) {
    this.driver = driver;
    notificationMessagesMaps = new NotificationMessagesMaps(driver);
  }
  
  public void clickCasoDeTeste() {
    notificationMessagesMaps.casoDeTeste().click();
    notificationMessagesMaps.clickhere().click();
    notificationMessagesMaps.flashNotice().isDisplayed();
  }
}
