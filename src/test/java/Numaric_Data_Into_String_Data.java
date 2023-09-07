import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numaric_Data_Into_String_Data {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\Automation\\AutomationExamples\\kondal.provider\\numaric into String1.xlsx");
    Workbook wb=WorkbookFactory.create(fis);
    Sheet sh=wb.getSheet("sheet1");
    String data=sh.getRow(1).getCell(0).getStringCellValue();
    System.out.println(data);
}
}
