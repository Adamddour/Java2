package oopKlausur_2020_2021;

public class TxtExportCreator extends Creator{

	@Override
	public Export factoryMethod() {
		
		return new DatenTxtExport();
	}
	
	

}
