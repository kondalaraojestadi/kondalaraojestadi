import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_Driven_numaric {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\Automation\\AutomationExamples\\kondal.provider\\numaricdata.xlsx");
    Workbook wb=WorkbookFactory.create(fis);
   double data=wb.getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
   System.out.println(data);
}
}
