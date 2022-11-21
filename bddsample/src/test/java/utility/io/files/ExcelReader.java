/**
 * 
 */
package utility.io.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Palak Tiwari
 *
 */
public class ExcelReader {

	private static final String String = null;
	// Properties
	String fileName;
	FileInputStream file;
	
	// For the MS Office format
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	
	// For the Open Office format
	XSSFWorkbook oworkbook;
	XSSFSheet osheet;
	
	

	// Constructor
	// ============
	public ExcelReader(String absoluteFilePath) throws IOException {
		// Step-1: File Stream for Excel file
		this.fileName =  absoluteFilePath;
		this.file = new FileInputStream(new File(this.fileName));

		// Step-2: Workbook obj
		this.workbook = new HSSFWorkbook(file);

		// Step-3: Extraction of Sheet
		this.sheet = this.workbook.getSheet("s1"); // getSheetAt(position_index);
		// Step-4: Extraction of Data from sheet
		// Step-5: Close the file stream obj

	}

	/**
	 * To fetch sheet by its name
	 * @param absoluteFilePath
	 * @param sheetName
	 * @throws Exception
	 */
	public ExcelReader(String absoluteFilePath, String sheetName) throws Exception {
		// Step-1: File Stream for Excel file
		this.fileName =  absoluteFilePath;
		this.file = new FileInputStream(new File(this.fileName));

		// Step-2: Workbook obj
		this.workbook = new HSSFWorkbook(file);

		// Step-3: Extraction of Sheet
		this.sheet = this.workbook.getSheet(sheetName); // getSheetAt(position_index);
	}
	
	/**
	 * To fetch sheet by its index
	 * @param absoluteFilePath
	 * @param sheetIndex
	 * @throws Exception
	 */
	public ExcelReader(String absoluteFilePath, int sheetIndex) throws Exception  {
		// Step-1: File Stream for Excel file
		this.fileName =  absoluteFilePath;
		this.file = new FileInputStream(new File(this.fileName));

		// Step-2: Workbook obj
		this.workbook = new HSSFWorkbook(file);

		// Step-3: Extraction of Sheet
		this.sheet = this.workbook.getSheetAt(sheetIndex);
	}

	// Methods
	// ============

	/**
	 * To extract data from a cell
	 * 
	 * @param ithPosition
	 * @param jthPosition
	 * @return
	 */
	/*
	 * public String readByCell(int ithPosition, int jthPosition) { String res;
	 * return res; }
	 */

	/**
	 * To extract the data from rows till data exist
	 * @return
	 */
	public void readByRows() {
		String res[][];
		
		// extract the data using iterator
		Iterator<Row> itrow = this.sheet.rowIterator();
		while(itrow.hasNext()) {
			 
			// Take the ROW's value
			Row row_val = itrow.next();
			
			// iterator for cell; as there would be multiple cells in a row
			Iterator<Cell> itcell = row_val.cellIterator();
			
			// to iterate on each cell
			while(itcell.hasNext()) {
				System.out.print(" | "+ itcell.next());
			}
			System.out.println();
			
		}
		//return res;
	}

/**
 * To Extract the rows with limit
 * 
 * @param limit
 * @return
 */
/*
 * public String[][] readByRows(int limit) { String res[][]; return res; }
 * 
 *//**
	 * To extract the data for a specific column
	 * 
	 * @param columnIndex
	 * @return
	 */
/*
 * public String[][] readByCols(int columnIndex) { String res[][]; return res; }
 * 
 *//**
	 * To Extract the data with limited columns
	 * 
	 * @param colIndex
	 * @param limit
	 * @return
	 */
/*
 * public String[][] readByCols(int columnIndex, int limit) { String res[][];
 * return res; }
 * 
 *//**
	 * To extract the data with limited rows and columns
	 * 
	 * @param rowIndex
	 * @param colIndex
	 * @return array of array of string
	 */

  public void readByRowsCols(int rowIndex, int colIndex) { 
	  String res[][];
	  int rowCounter=0; 
	  int colCounter=0;
	  DataFormatter d = new DataFormatter();
		
		// extract the data using iterator
		Iterator<Row> itrow = this.sheet.rowIterator();
		while(itrow.hasNext() && rowCounter < rowIndex) {
			//
			 
			// Take the ROW's value
			Row row_val = itrow.next();
			Iterator<Cell> itcell = row_val.cellIterator();
			
			// to iterate on each cell/col
			colCounter = 0;
			while(itcell.hasNext() && colCounter < colIndex) {
				//
				Cell val = itcell.next();
				System.out.print(" | "+ d.formatCellValue(val));
				
				// if this value is equlas to "City / Age / blabla"
				// tagetIndex = colCounter;
				colCounter++;
			}
			System.out.println();
			rowCounter++;
		}
		try {
			this.file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return res; 
	}
  
 
}