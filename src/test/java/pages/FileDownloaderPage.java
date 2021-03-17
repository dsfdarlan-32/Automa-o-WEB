package pages;

import java.io.File;

import maps.FileDownloaderMaps;

public class FileDownloaderPage extends BasePage {
  FileDownloaderMaps fileDownloaderMaps;
  
  public FileDownloaderPage() {
    fileDownloaderMaps = new FileDownloaderMaps();
  }
  
  public Boolean clickCasoDeTeste() throws InterruptedException {
    String arquivo = "some-file.txt";
    File file = new File("C://Users/dsilvafe/Downloads/" + arquivo + "");
    file.deleteOnExit();
    click(fileDownloaderMaps.casoDeTeste);
    click(fileDownloaderMaps.WikiData1(arquivo));
    Thread.sleep(2000);
    return file.exists();
  }
}
