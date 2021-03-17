package cenarios;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pages.DynamicControlsPage;

public class DynamicControls extends BaseTest{
  DynamicControlsPage dynamicControlsPage;
  
  @Before
  public void setUp() throws Exception {
    dynamicControlsPage = new DynamicControlsPage();
  }
  
  @Test
  public void test() throws InterruptedException {
    assertTrue(dynamicControlsPage.clickCasoDeTeste());;
  }
}
