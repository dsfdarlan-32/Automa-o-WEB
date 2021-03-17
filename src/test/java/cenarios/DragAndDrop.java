package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.DragAndDropPage;

public class DragAndDrop extends BaseTest {
  DragAndDropPage dragAndDropPage;
  
  @Before
  public void setUp() throws Exception {
    dragAndDropPage = new DragAndDropPage();

  }
  
  @Test
  public void test() throws InterruptedException {
    dragAndDropPage.clickCasoDeTeste();
  }
}
