package pages;

import java.util.ArrayList;

import maps.MultipleWindowsMaps;

public class MultipleWindowsPage extends BasePage{
  MultipleWindowsMaps multipleWindowsMaps;
  
  public MultipleWindowsPage() {
    multipleWindowsMaps = new MultipleWindowsMaps();
  }
  
  public void clickCasoDeTeste() {
    click(multipleWindowsMaps.casoDeTeste);
    click(multipleWindowsMaps.clickHere);
    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    isDisplayed(multipleWindowsMaps.newWindow);
  }
}
