package pages;

import maps.DropdownListMaps;

public class DropdownListPage extends BasePage {
  DropdownListMaps dropdownListMaps;
  
  public DropdownListPage() {
    dropdownListMaps = new DropdownListMaps();
  }
  
  public void clickCasoDeTeste() {
    click(dropdownListMaps.casoDeTeste);
    sendKeys(dropdownListMaps.selectDropdownList, "Option 1");
  }
}
