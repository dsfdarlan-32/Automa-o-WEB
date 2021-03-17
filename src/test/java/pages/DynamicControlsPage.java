package pages;

import maps.DynamicControlsMaps;

public class DynamicControlsPage extends BasePage {
  DynamicControlsMaps dynamicControlsMaps;
  
  public DynamicControlsPage() {
    dynamicControlsMaps = new DynamicControlsMaps();
  }
  
  public Boolean clickCasoDeTeste() throws InterruptedException {
    click(dynamicControlsMaps.casoDeTeste);
    if (isDisplayed(dynamicControlsMaps.buttonRemove)) {
      click(dynamicControlsMaps.buttonRemove);
    }
    waitElement(dynamicControlsMaps.buttonAdd, 60);
    return (isDisplayed(dynamicControlsMaps.buttonAdd));
  }
}
