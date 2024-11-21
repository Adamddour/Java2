package OopKlausur_2022_2023;


public class CsvExportCreator extends Creator {

	 @Override 
	 public Export factoryMethod() { 
	  return new DatenCsvExport(); 
	 } 
}
