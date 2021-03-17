package maps;

import org.openqa.selenium.By;

public class FileUploaderMaps {
  public By casoDeTeste = By.xpath("//a[contains(text(),'File Upload')]");
  public By inputEscolharArquivo = By.xpath("//input[contains(@id,'file-upload')]");
  public By inputUpload = By.xpath("//input[@id='file-submit']");
}
