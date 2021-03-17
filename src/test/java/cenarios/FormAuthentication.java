package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.FormAuthenticationPage;

public class FormAuthentication extends BaseTest {
  FormAuthenticationPage formAuthenticationPage;
  
  @Before
  public void setUp() throws Exception {
    formAuthenticationPage = new FormAuthenticationPage();
  }
  
  @Test
  public void test() {
    formAuthenticationPage.clickCasoDeTeste();
  }
}
