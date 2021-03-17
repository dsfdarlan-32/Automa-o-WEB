package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.FramesPage;

public class Frames extends BaseTest {
  FramesPage framesPage;
  
  @Before
  public void setUp() throws Exception {
    framesPage = new FramesPage();
  }
  
  @Test
  public void test() {
    framesPage.clickCasoDeTeste();
  }
}
