package pages;

import org.openqa.selenium.WebDriver;

import maps.FramesMaps;

public class FramesPage {
  private WebDriver driver;
  FramesMaps framesMaps;
  
  public FramesPage(WebDriver driver) {
    this.driver = driver;
    framesMaps = new FramesMaps(driver);
  }
  
  public void clickCasoDeTeste() {
    framesMaps.casoDeTeste().click();
    framesMaps.iFrame().click();
    framesMaps.frame();
    framesMaps.caixaTexto().clear();
    framesMaps.caixaTexto().sendKeys("teste");
  }
}
