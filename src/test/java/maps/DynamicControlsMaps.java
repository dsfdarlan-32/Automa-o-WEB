package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class DynamicControlsMaps {
  public By casoDeTeste = new ByXPath("//a[contains(text(),'Dynamic Controls')]");
  public By buttonRemove = new ByXPath("//button[text()='Remove']");
  public By buttonAdd = new ByXPath("//button[text()='Add']");
}
