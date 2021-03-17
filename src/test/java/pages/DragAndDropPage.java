package pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.Driver;
import maps.DragAndDropMaps;

public class DragAndDropPage extends BasePage {
  DragAndDropMaps dragAndDropMaps;
  
  public DragAndDropPage() {
    dragAndDropMaps = new DragAndDropMaps();
  }
  
  public void clickCasoDeTeste() throws InterruptedException {
    click(dragAndDropMaps.casoDeTeste);
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);
    wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(dragAndDropMaps.columnB)));
    Actions action = new Actions(driver);
    action.click(Driver.getDriver().findElement(dragAndDropMaps.columnA))
        .moveToElement(Driver.getDriver().findElement(dragAndDropMaps.columnB))
        .release(Driver.getDriver().findElement(dragAndDropMaps.columnA)).build().perform();
  }
}
