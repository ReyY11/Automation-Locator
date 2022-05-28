package module_9.testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import module_9.objectRepo.HomePageOR;
import module_9.objectRepo.TestingFormPageOR;
import module_9.utilities.BaseClass;

public class TC_3 extends BaseClass {
	Workbook wb;
	Sheet sh;
	int numrows;
	int numcols;
	
	@BeforeTest 
	public  void setUpSystem() {
		openBrowser("chrome");
		openAUT();
		}
    @Test(dataProvider="supplyData")
    public void formFill(String fname, String lname, String address, int indexValue) {
    	HomePageOR hor= new HomePageOR();
    	hor.clickTestingFormPage();
    	
    	TestingFormPageOR tfpOR= new TestingFormPageOR();
    	tfpOR.formFill(fname, lname, address, indexValue);
    }
    	@DataProvider
    	public Object[][] supplyData() throws EncryptedDocumentException, IOException{
    		// File location
    		FileInputStream fis= new FileInputStream(".\\src\\module_9\\dataSet\\testData.xlsx");
    		//Open workbook
    		wb= WorkbookFactory.create(fis);
    		// Declare the sheet for reading
    		sh=wb.getSheet("Sheet1");
    		// Declaring each dimension of the two dimensional objects
    		numrows= sh.getLastRowNum();
    		numcols= sh.getRow(0).getLastCellNum();
    		// Using a for loop to read & extract the data
    		Object[][] dataSet= new Object[numrows][numcols];
    		// Using a nested loop to read & extract the data
    		for (int row=0;row<numrows;row++)
    		{
    			for(int col=0; col<numcols;col++)
    			{
    				dataSet[row][col]=sh.getRow(row).getCell(col).toString();
    			}
    	}
    	
    		
    		return dataSet;
    }
    	
    	
    	
	
	
	
}