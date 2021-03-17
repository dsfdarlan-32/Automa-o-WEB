package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class DynamicContentMaps {
  public By casoDeTeste = new ByXPath("//a[contains(text(),'Dynamic Content')]");
  public By clickHere = new ByXPath("//a[text()='click here']");
  public By avatar7 = new ByXPath("//img[@src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-7.jpg']");
}
