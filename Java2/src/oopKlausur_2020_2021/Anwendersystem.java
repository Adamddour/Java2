package oopKlausur_2020_2021;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

public class Anwendersystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// a:
		PersonEn[] p=PersonEn.values();
		
		// b:
		ArrayList<Person> liste=new ArrayList<Person>();
		Person p1=new Person("Musterfrau", "Elke", 1981);
		Person p2=new Person("MusteMann", "Max", 1970);
		
		
		liste.add(p1);
		liste.add(p2);
		
		for(Person personenListe:liste) {
			System.out.println(personenListe.getVorname()+" "+personenListe.getNachname()+":"+personenListe.getGeburtsjahr());
		}
		
		// a:
		/*for(PersonEn liste:p) {
			System.out.println(liste);
			System.out.println(liste.getVorname()+" "+liste.getGeburtsjahr()+":"+" Durch zwei Teilbar?"+liste.durchZwei());
		}*/
		
		BooleanSupplier bs=()->p2.durchZwei();
		
		System.out.println("Geburtsjahr durch 2 teilbar? "+bs.getAsBoolean());
		

	}

}
