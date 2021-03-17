package pages;

import maps.NotificationMessagesMaps;

public class NotificationMessagesPage extends BasePage {
  NotificationMessagesMaps notificationMessagesMaps;
  
  public NotificationMessagesPage() {
    notificationMessagesMaps = new NotificationMessagesMaps();
  }
  
  public void clickCasoDeTeste() {
    click(notificationMessagesMaps.casoDeTeste);
    click(notificationMessagesMaps.clickhere);
    isDisplayed(notificationMessagesMaps.flashNotice);
  }
}
