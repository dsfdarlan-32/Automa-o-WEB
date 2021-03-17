package pages;

import maps.DynamicContentMaps;

public class DynamicContentPage extends BasePage {
  DynamicContentMaps dynamicContentMaps;
  
  public DynamicContentPage() {
    dynamicContentMaps = new DynamicContentMaps();
  }
  
  public void clickCasoDeTeste() {
    Boolean repeat = true;
    click(dynamicContentMaps.casoDeTeste);
    do {
      try {
        isDisplayed(dynamicContentMaps.avatar7);
        repeat = false;
      } catch (Exception e) {
        click(dynamicContentMaps.clickHere);
      }
    } while (repeat);
  }
}
