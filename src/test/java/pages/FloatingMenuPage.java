package pages;

import maps.FloatingMenuMaps;

public class FloatingMenuPage extends BasePage {
  FloatingMenuMaps floatingMenuMaps;
  
  public FloatingMenuPage() {
    floatingMenuMaps = new FloatingMenuMaps();
  }
  
  public void clickMenu(String text) {
    click(floatingMenuMaps.Menu(text));
  }
  
  public void clickCasoDeTeste() {
    click(floatingMenuMaps.casoDeTeste);
  }
}
