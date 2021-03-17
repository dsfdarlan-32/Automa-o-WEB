package pages;

import maps.DisappearingElementsMaps;

public class DisappearingElementsPage extends BasePage {
  DisappearingElementsMaps disappearingElementsMaps;
  String teste = "Falhou";
  
  public DisappearingElementsPage() {
    disappearingElementsMaps = new DisappearingElementsMaps();
  }
  
  public void clickCasoDeTeste() {
    Boolean repeat = true;
    click(disappearingElementsMaps.casoDeTeste);
    do {
      try {
        click(disappearingElementsMaps.buttonGallery);
        repeat = false;
      } catch (Exception e) {
        refresh();
      }
    } while (repeat);
  }
}
