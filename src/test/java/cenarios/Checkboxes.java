package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.CheckboxesPage;

public class Checkboxes extends BaseTest {
  CheckboxesPage checkboxesPage;
  
  @Before
  public void setUp() throws Exception {
    checkboxesPage = new CheckboxesPage();
  }
  
  @Test
  public void test() {
    checkboxesPage.clickCasoDeTeste();
  }
}
