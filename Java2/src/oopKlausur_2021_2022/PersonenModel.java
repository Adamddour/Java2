package oopKlausur_2021_2022;

import java.util.Vector; 


public class PersonenModel implements Observable{
	
	private Vector<String> personen = new Vector<>(); 
	
	private Vector<Observer> observers=new Vector<>();
	
	public void lesePersonenAusDatei() { 
	// anstatt Lesen aus Datei  
		this.personen.add("Mustermann"); 
		this.personen.add("Musterfrau"); 
		notfiyObservers();
	} 
	
	public String gibPersonenAus() { 
		return this.personen.toString(); 
	}

	@Override
	public void addObserver(Observer obs) {
		observers.add(obs);
		
	}

	@Override
	public void removeObserver(Observer obs) {
		
		observers.remove(obs);
	}

	@Override
	public void notfiyObservers() {
		
		for(Observer obs:observers) {
			obs.update();
		}
	} 

	
}
