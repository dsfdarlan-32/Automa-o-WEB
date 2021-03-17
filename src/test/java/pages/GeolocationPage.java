package pages;

import org.openqa.selenium.WebDriver;

import maps.GeolocationMaps;

public class GeolocationPage {
  GeolocationMaps geolocationMaps;
  
  public GeolocationPage(WebDriver driver) {
    geolocationMaps = new GeolocationMaps(driver);
  }
  
  public void clickCasoDeTeste() {
    geolocationMaps.casoDeTeste().click();
    geolocationMaps.whereAmI().click();
    geolocationMaps.localizacao().isDisplayed();
  }
}
