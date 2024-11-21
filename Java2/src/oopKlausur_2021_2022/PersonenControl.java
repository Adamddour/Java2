package oopKlausur_2021_2022;

public class PersonenControl {

	private PersonenModel personenModel; 
	private PersonenView personenView; 
	   
	 public PersonenControl() { 
		  this.personenModel = new PersonenModel(); 
		  this.personenView = new PersonenView(this.personenModel, this); 
		  //Test 
		  this.personenModel.lesePersonenAusDatei(); 
		  //this.personenView.updateAnzeigePersonen(); 
	 }


}
