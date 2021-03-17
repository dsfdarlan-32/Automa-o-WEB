package pages;

import org.openqa.selenium.WebDriver;

import maps.HoversMaps;

public class HoversPage {
  private WebDriver driver;
  HoversMaps hoversMaps;
  
  public HoversPage(WebDriver driver) {
    this.driver = driver;
    hoversMaps = new HoversMaps(driver);
  }
  
  public void clickCasoDeTeste() {
    hoversMaps.casoDeTeste().click();
    hoversMaps.serAvatar1().click();
    hoversMaps.viewProfile().isDisplayed();
  }
}
