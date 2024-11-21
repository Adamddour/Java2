package oopKlausur;

import java.util.function.BooleanSupplier;

public class PersonSupplier implements BooleanSupplier{

	private PersonMitGeburtsjahr personM;
	
	
	public PersonSupplier(PersonMitGeburtsjahr personM) {
		
		this.personM = personM;
	}


	@Override
	public boolean getAsBoolean() {
		
		if(personM.getGeburtsjahr()<2000) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

}
