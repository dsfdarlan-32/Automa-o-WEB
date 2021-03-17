package pages;

import maps.JQueryUIMenusMaps;

public class JQueryUIMenusPage extends BasePage {
  JQueryUIMenusMaps jQueryUIMenusMaps;
  
  public JQueryUIMenusPage() {
    jQueryUIMenusMaps = new JQueryUIMenusMaps();
  }
  
  public void clickCasoDeTeste() throws InterruptedException {
    click(jQueryUIMenusMaps.casoDeTeste);
    /*
     * jQueryUIMenusMaps.enabled().click(); Thread.sleep(2000);
     * System.out.println(jQueryUIMenusMaps.backToJQueryUI().isEnabled());
     * jQueryUIMenusMaps.backToJQueryUI().click();
     */
    moveToElement(jQueryUIMenusMaps.enabled);
    waitElement(jQueryUIMenusMaps.backToJQueryUI, 10);
    click(jQueryUIMenusMaps.backToJQueryUI);
  }
}
