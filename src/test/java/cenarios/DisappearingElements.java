package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.DisappearingElementsPage;

public class DisappearingElements extends BaseTest {
  DisappearingElementsPage disappearingElementsPage;
  
  @Before
  public void setUp() throws Exception {
    disappearingElementsPage = new DisappearingElementsPage();
  }
  
  @Test
  public void test() {
    disappearingElementsPage.clickCasoDeTeste();
  }
}
