import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Nuemaric_to_String {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\Automation\\AutomationExamples\\kondal.provider\\Numaric to String value.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
}
}
