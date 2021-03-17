package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import maps.FileUploaderMaps;

public class FileUploaderPage extends BasePage {
  FileUploaderMaps fileUploaderMaps;
  
  public FileUploaderPage() {
    fileUploaderMaps = new FileUploaderMaps();
  }
  
  /**
   * Upload a pdf file
   */
  public static void uploadFile() {
    try {
      String FilePath = new File("data").getAbsolutePath() + "\\FileToUpload.pdf";
      // Setting clipboard with file location
      setClipboardData(FilePath);
      // native key strokes for CTRL, V and ENTER keys
      Robot robot = new Robot();
      Thread.sleep(1000);
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
    } catch (Exception exp) {
      exp.printStackTrace();
    }
  }
  
  /**
   * Store in the clipboard a data to copy and paste
   */
  public static void setClipboardData(String string) {
    // StringSelection is a class that can be used for copy and paste
    // operations.
    StringSelection stringSelection = new StringSelection(string);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
  }
  
  public void clickCasoDeTeste() {
    click(fileUploaderMaps.casoDeTeste);
    click(fileUploaderMaps.inputEscolharArquivo);
    uploadFile();
    click(fileUploaderMaps.inputUpload);
  }
}
