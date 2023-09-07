import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_driven_From_Excelsheet {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\Automation\\AutomationExamples\\kondal.provider\\Book1.xlsx");
    Workbook Wb=WorkbookFactory.create(fis);
    Sheet sh=Wb.getSheet("sheet1");
    String data=sh.getRow(0).getCell(0).getStringCellValue();
    System.out.println(data);


}
}
