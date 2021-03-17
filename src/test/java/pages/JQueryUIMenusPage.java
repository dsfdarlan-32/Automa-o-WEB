package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import maps.JQueryUIMenusMaps;

public class JQueryUIMenusPage {
  private WebDriver driver;
  JQueryUIMenusMaps jQueryUIMenusMaps;
  
  public JQueryUIMenusPage(WebDriver driver) {
    this.driver = driver;
    jQueryUIMenusMaps = new JQueryUIMenusMaps(driver);
  }
  
  public void clickCasoDeTeste() throws InterruptedException {
    jQueryUIMenusMaps.casoDeTeste().click();
    /*
     * jQueryUIMenusMaps.enabled().click(); Thread.sleep(2000);
     * System.out.println(jQueryUIMenusMaps.backToJQueryUI().isEnabled());
     * jQueryUIMenusMaps.backToJQueryUI().click();
     */
    Actions action = new Actions(driver);
    action.moveToElement(jQueryUIMenusMaps.enabled()).build().perform();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOf(jQueryUIMenusMaps.backToJQueryUI()));
    jQueryUIMenusMaps.backToJQueryUI().click();
  }
}
