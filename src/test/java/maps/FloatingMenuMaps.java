package maps;

import org.openqa.selenium.By;

public class FloatingMenuMaps {
  public By casoDeTeste = By.xpath("//a[contains(text(),'Floating Menu')]");
  
  public By Menu (String text) {
   return By.xpath("//*[text()='" + text + "']");
  }
}
