package cenarios;

import org.junit.Before;
import org.junit.Test;

import pages.FileUploaderPage;

public class FileUploader extends BaseTest {
  FileUploaderPage fileUploaderPage;
  
  @Before
  public void setUp() throws Exception {
    fileUploaderPage = new FileUploaderPage();
  }
  
  @Test
  public void test() {
    fileUploaderPage.clickCasoDeTeste();
  }
}
