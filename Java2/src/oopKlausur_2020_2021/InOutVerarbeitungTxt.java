package oopKlausur_2020_2021;

import java.io.IOException;

public class InOutVerarbeitungTxt {
	
	private static InOutVerarbeitungTxt instance;
	
	private InOutVerarbeitungTxt() {}
	
	public InOutVerarbeitungTxt getInstance() {
		if(instance==null) {
			instance=new InOutVerarbeitungTxt();
		}
		return instance;
	}
	
	public void verwendeFabricMethod() throws IOException {
		
		Creator creator=new TxtExportCreator();
		Export export=creator.factoryMethod();
		export.schreibeDatenInDatei();
	}

}
