package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.DynamicContentPage;

public class DynamicContent extends BaseTest{
  DynamicContentPage dynamicContentPage;
  
  @Before
  public void setUp() throws Exception {
    dynamicContentPage = new DynamicContentPage();
  }
  
  @Test
  public void test() {
    dynamicContentPage.clickCasoDeTeste();
  }

}
