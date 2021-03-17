package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.JQueryUIMenusPage;

public class JQueryUIMenus extends BaseTest {
  JQueryUIMenusPage jQueryUIMenusPage;
  
  @Before
  public void setUp() throws Exception {
    jQueryUIMenusPage = new JQueryUIMenusPage();
  }
  
  @Test
  public void test() throws InterruptedException {
    jQueryUIMenusPage.clickCasoDeTeste();
  }
}
