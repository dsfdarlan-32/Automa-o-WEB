package pages;

import maps.ChallengingDOMMaps;

public class ChallengingDOMPage extends BasePage {
  ChallengingDOMMaps challengingDOMMaps;
  
  public ChallengingDOMPage() {
    challengingDOMMaps = new ChallengingDOMMaps();
  }
  
  public void clickCasoDeTeste() {
    click(challengingDOMMaps.casoDeTeste);
    click(challengingDOMMaps.buttonAzul);
    click(challengingDOMMaps.buttonVermelho);
    click(challengingDOMMaps.buttonVerde);
    click(challengingDOMMaps.buttonEdit);
  }
}
