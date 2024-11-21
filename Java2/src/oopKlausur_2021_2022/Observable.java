package oopKlausur_2021_2022;

public interface Observable {
	
	public void addObserver(Observer obs);
	public void removeObserver(Observer obs);
	public void notfiyObservers();

}
