package pages;

import maps.FramesMaps;

public class FramesPage extends BasePage {
  FramesMaps framesMaps;
  
  public FramesPage() {
    framesMaps = new FramesMaps();
  }
  
  public void clickCasoDeTeste() {
    click(framesMaps.casoDeTeste);
    click(framesMaps.iFrame);
    moveToFrame(framesMaps.frame);
    clear(framesMaps.caixaTexto);
    sendKeys(framesMaps.caixaTexto, "teste");
    moveToDefaultContent();
    isDisplayed(framesMaps.textoIFrame);
  }
}
