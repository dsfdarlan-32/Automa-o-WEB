package pages;

import maps.HoversMaps;

public class HoversPage extends BasePage {
  HoversMaps hoversMaps;
  
  public HoversPage() {
    hoversMaps = new HoversMaps();
  }
  
  public void clickCasoDeTeste() {
    click(hoversMaps.casoDeTeste);
    click(hoversMaps.serAvatar1);
    isDisplayed(hoversMaps.viewProfile);
  }
}
