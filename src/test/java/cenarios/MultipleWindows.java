package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.MultipleWindowsPage;

public class MultipleWindows extends BaseTest {
  MultipleWindowsPage multipleWindowsPage;
  
  @Before
  public void setUp() throws Exception {
    multipleWindowsPage = new MultipleWindowsPage();
  }
  
  @Test
  public void test() {
    multipleWindowsPage.clickCasoDeTeste();
  }
}
