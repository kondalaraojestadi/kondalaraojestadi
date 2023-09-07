import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\Automation\\AutomationExamples\\kondal.provider\\Boolean.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	boolean data=wb.getSheet("Sheet1").getRow(0).getCell(0).getBooleanCellValue();
	System.out.println(data);
	
}
}
