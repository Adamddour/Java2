package oopKlausur_2021_2022;

public class PersonenView implements Observer{
	
	PersonenModel personenModel; 
	 PersonenControl personenControl; 
	     
	 public PersonenView(PersonenModel personenModel,PersonenControl personenControl) { 
		  this.personenModel = personenModel; 
		  this.personenControl = personenControl; 
		  personenModel.addObserver(this);
	 } 
	     
	 public void updateAnzeigePersonen() { 
		 System.out.println(this.personenModel.gibPersonenAus()); 
	 }

	@Override
	public void update() {
		updateAnzeigePersonen();
	}

}
