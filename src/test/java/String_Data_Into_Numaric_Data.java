import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_Data_Into_Numaric_Data {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet1");
	double data=sh.getRow(1).getCell(0).getNumericCellValue();
	System.out.println(data);
}
}
