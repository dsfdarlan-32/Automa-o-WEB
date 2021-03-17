package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.HoversPage;

public class Hovers extends BaseTest {
  HoversPage hoversPage;
  
  @Before
  public void setUp() throws Exception {
    hoversPage = new HoversPage();
  }
  
  @Test
  public void test() {
    hoversPage.clickCasoDeTeste();
  }
}
