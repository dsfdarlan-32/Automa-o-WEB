package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class DropdownListMaps {
  public By casoDeTeste = new ByXPath("//a[contains(text(),'Dropdown')]");
  public By selectDropdownList = new ByXPath("//select[@id='dropdown']");
}
