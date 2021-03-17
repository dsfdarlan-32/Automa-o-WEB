package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class CheckboxesMaps {
  public By casoDeTeste = new ByXPath("//a[contains(text(),'Checkboxes')]");
  public By checkbox1 = new ByXPath("//input[@type='checkbox'][1]");
  public By checkbox2 = new ByXPath("//input[@type='checkbox'][2]");
}
