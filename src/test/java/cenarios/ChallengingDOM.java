package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.ChallengingDOMPage;

public class ChallengingDOM extends BaseTest {
  ChallengingDOMPage challengingDOMPage;
  
  @Before
  public void setUp() throws Exception {
    challengingDOMPage = new ChallengingDOMPage();
  }
  
  @Test
  public void test() {
    challengingDOMPage.clickCasoDeTeste();
  }
}
