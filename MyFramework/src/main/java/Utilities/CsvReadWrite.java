package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CsvReadWrite {
	FileReader fw;
	public  CsvReadWrite (String path) throws FileNotFoundException
	{
		 fw= new FileReader(path);
		
	}
	public String  getdata(String key) throws IOException
	{
		String value = null;
		CSVParser pars = CSVFormat.DEFAULT.withDelimiter(',').withHeader().parse(fw);
		for(CSVRecord i : pars)
		{
			 value=i.get(key);
		}
		return value;
				
	}
}
