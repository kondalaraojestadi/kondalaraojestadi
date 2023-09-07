package practice;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Data_Driven_from_Notepad {
public static void main(String[] args) throws Throwable {
	File fis=new File("D:\\Automation\\AutomationExamples\\kondal.provider\\creditional.properties");
	FileInputStream f=new FileInputStream(fis);
	Properties p=new Properties();
	p.load(f);
	System.out.println(p.getProperty("UN"));
	
}
}
