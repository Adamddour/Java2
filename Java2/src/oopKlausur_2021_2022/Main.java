package oopKlausur_2021_2022;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		Person p1=new Person("Musterfrau","Elke","ledig");
		Person p2=new Person("Mustermann","Max","nicht");
		
		ArrayList<Person> pListe=new ArrayList<>();
		
		pListe.add(p1);
		pListe.add(p2);
		
		
		for(Person person:pListe) {
			
			//System.out.println(person);
			System.out.println(person.getNachname()+" "+person.getVorname()+":"+person.familienStand());
		}
		
		
		BooleanSupplier bs=()->p1.familienStand();
		
		System.out.println("Ledig?"+bs.getAsBoolean());
		
		Supplier<String> ss=()->"ledig? "+p1.familienStand();
		System.out.println(ss.get());
		

		
		
		//new PersonenControl(); 
	}
}
