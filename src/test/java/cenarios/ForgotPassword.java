package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.ForgotPasswordpage;

public class ForgotPassword  extends BaseTest{
  ForgotPasswordpage forgotPasswordpage;
  
  @Before
  public void setUp() throws Exception {
    forgotPasswordpage = new ForgotPasswordpage();
  }
  
  @Test
  public void test() {
    forgotPasswordpage.clickCasoDeTeste();
  }
}
