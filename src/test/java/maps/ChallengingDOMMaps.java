package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class ChallengingDOMMaps {
  public By casoDeTeste = new ByXPath("//a[contains(text(),'Challenging DOM')]");
  public By buttonAzul = new ByXPath("//a[@class='button']");
  public By buttonVermelho = new ByXPath("//a[@class='button alert']");
  public By buttonVerde = new ByXPath("//a[@class='button success']");
  public By buttonEdit = new ByXPath(" (//a[text()='edit'])[1]");
}
