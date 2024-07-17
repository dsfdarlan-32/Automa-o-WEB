package utill;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import br.com.vivo.commons.enums.GeneralMessage;

public class LeitoDados {

	public void getDataSheet() {
		String filePath = "C:\\Users\\dsfdarlan\\Downloads\\export.xlsx";
		String nameSheet = "Modelo";
		String nameCollunm = "Status";

		try {
			FileInputStream dataSheet = new FileInputStream(new File(filePath));

			XSSFWorkbook workbook = new XSSFWorkbook(dataSheet);
			XSSFSheet sheet = workbook.getSheet(nameSheet);

			short lastValue = sheet.getRow(1).getLastCellNum();
			short firstValue = sheet.getRow(1).getFirstCellNum();

			for (short c = firstValue; c <= lastValue - 1; c++) {
				String getCollunm = sheet.getRow(0).getCell(c).toString();

				if (getCollunm.equals(nameCollunm)) {
					short lastRowNum = (short) sheet.getLastRowNum();
					for (int r = 1; r <= (int) lastRowNum; r++) {
						String getCell = sheet.getRow(r).getCell(c).toString();

					}
				}
			}
			workbook.close();
			dataSheet.close();
		} catch (IOException e) {
			System.out.println(GeneralMessage.DATASHEETERROR.getMessage() + ": " + e.getMessage());
		}
	}
}
