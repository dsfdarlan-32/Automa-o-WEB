package cenarios;

import java.awt.AWTException;

import org.junit.Before;
import org.junit.Test;

import pages.KeyPressesPage;

public class KeyPresses extends BaseTest {
  KeyPressesPage keyPressesPage;
  
  @Before
  public void setUp() throws Exception {
    keyPressesPage = new KeyPressesPage();
  }
  
  @Test
  public void test() throws AWTException {
    keyPressesPage.clickCasoDeTeste();
  }
}
