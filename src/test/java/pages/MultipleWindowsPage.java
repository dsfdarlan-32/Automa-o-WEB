package pages;

import org.openqa.selenium.WebDriver;

import maps.MultipleWindowsMaps;

public class MultipleWindowsPage {
  private WebDriver driver;
  MultipleWindowsMaps multipleWindowsMaps;
  
  public MultipleWindowsPage(WebDriver driver) {
    this.driver = driver;
    multipleWindowsMaps = new MultipleWindowsMaps(driver);
  }
  
  public void clickCasoDeTeste() {
    multipleWindowsMaps.casoDeTeste().click();
    multipleWindowsMaps.clickHere().click();
    // List<String> abas = new ArrayList<String>(driver.getWindowHandles());
    // driver.switchTo().window(abas.get(1));
    multipleWindowsMaps.newWindow().isDisplayed();
  }
}
