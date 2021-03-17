package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.FloatingMenuPage;

public class FloatingMenu extends BaseTest {
  FloatingMenuPage floatingMenuPage;
  
  @Before
  public void setUp() throws Exception {
    floatingMenuPage = new FloatingMenuPage();
  }
  
  @Test
  public void test() {
    floatingMenuPage.clickCasoDeTeste();
    floatingMenuPage.clickMenu("Home");
    floatingMenuPage.clickMenu("News");
    floatingMenuPage.clickMenu("Contact");
  }
}
