import utility.io.files.ExcelReader;

public class DriverClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			ExcelReader r = new ExcelReader("C:\\Users\\Palak Tiwari\\Documents\\Book1.xls", 0);
			//r.readByRows();
			r.readByRowsCols(2, 2);
			
	}

}
