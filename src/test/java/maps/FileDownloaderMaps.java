package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class FileDownloaderMaps {
  public By casoDeTeste = new ByXPath("(//a[contains(text(),'File Download')])[1]");
  
  public By WikiData1(String teste) {
    return new ByXPath("//a[text()='" + teste + "']");
  }
}
