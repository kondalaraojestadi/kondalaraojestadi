import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practice {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\Automation\\AutomationExamples\\kondal.provider\\Numaric practice.xlsx");
    Workbook wb=WorkbookFactory.create(fis);
    double data=wb.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
    System.out.println(data);
}
}
