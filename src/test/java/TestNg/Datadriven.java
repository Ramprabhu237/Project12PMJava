package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;

import org.apache.poi.ss.usermodel.Workbook;

public class Datadriven {
	
	String data [][]=null;
	
	public static void GettingdatafromExcel () throws IOException {
		
		FileInputStream exel = new FileInputStream("C:\\Users\\USER\\Documents");
		Workbook workbook = Workbook.getWorkbook(exel);
		
		
	}

}
