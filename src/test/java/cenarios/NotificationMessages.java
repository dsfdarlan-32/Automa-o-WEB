package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.NotificationMessagesPage;

public class NotificationMessages {
  NotificationMessagesPage notificationMessagesPage;
  
  @Before
  public void setUp() throws Exception {
    notificationMessagesPage = new NotificationMessagesPage();
  }
  
  @Test
  public void test() {
    notificationMessagesPage.clickCasoDeTeste();
  }
}
