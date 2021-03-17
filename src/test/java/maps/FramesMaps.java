package maps;

import org.openqa.selenium.By;

public class FramesMaps {
  public By casoDeTeste = By.xpath("//a[contains(text(),'Frames')]");
  public By iFrame = By.xpath("//a[text()='iFrame']");
  public By frame = By.xpath("//iframe[@id='mce_0_ifr']");
  public By caixaTexto = By.xpath("//body[@id='tinymce']");
}
