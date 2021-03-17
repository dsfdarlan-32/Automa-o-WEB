package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.DropdownListPage;

public class DropdownList extends BaseTest {
  DropdownListPage DropdownListPage;
  
  @Before
  public void setUp() throws Exception {
    DropdownListPage = new DropdownListPage();
  }
  
  @Test
  public void test() {
    DropdownListPage.clickCasoDeTeste();
  }
}
