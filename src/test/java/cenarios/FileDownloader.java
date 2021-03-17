package cenarios;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pages.FileDownloaderPage;

public class FileDownloader extends BaseTest{
  FileDownloaderPage fileDownloaderPage;
  
  @Before
  public void setUp() throws Exception {
    fileDownloaderPage = new FileDownloaderPage();
  }
  
  @Test
  public void test() throws InterruptedException {
    Assert.assertTrue(fileDownloaderPage.clickCasoDeTeste());
  }
}
