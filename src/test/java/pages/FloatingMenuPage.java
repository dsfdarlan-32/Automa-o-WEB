package pages;

import org.openqa.selenium.WebDriver;

import maps.FloatingMenuMaps;

public class FloatingMenuPage {
  private WebDriver driver;
  FloatingMenuMaps floatingMenuMaps;
  
  public FloatingMenuPage(WebDriver driver) {
    this.driver = driver;
    floatingMenuMaps = new FloatingMenuMaps(driver);
  }
  
  public void clickMenu(String text) {
    floatingMenuMaps.Menu(text).click();
  }
  
  public void clickCasoDeTeste() {
    floatingMenuMaps.casoDeTeste().click();
  }
}
