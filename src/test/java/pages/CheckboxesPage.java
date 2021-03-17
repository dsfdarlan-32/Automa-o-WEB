package pages;

import maps.CheckboxesMaps;

public class CheckboxesPage extends BasePage {
  CheckboxesMaps checkboxesMaps;
  
  public CheckboxesPage() {
    checkboxesMaps = new CheckboxesMaps();
  }
  
  public void clickCasoDeTeste() {
    click(checkboxesMaps.casoDeTeste);
    click(checkboxesMaps.checkbox2);
    click(checkboxesMaps.checkbox1);
  }
}
