package wiederholung;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import java.util.*;

public class Anwendersystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bahnhof bahnhofBo = new Bahnhof("Bochum Hauptbahnhof", 7, 2010); 
		BahnhoBahnhofsgebaeude bahnhofEs= new BahnhoBahnhofsgebaeude("Essen Hauptbahnhof", 15, 2012, true); 
		
		
		//Aufgabe 2 a:
		/*ArrayList<Bahnhof> liste=new ArrayList<Bahnhof>();
		liste.add(bahnhofBo);
		liste.add(bahnhofEs);
		
		for(Bahnhof li:liste) {
			System.out.println(li.gibAttributeZurueck());
		}
		*/
		
		//Aufgabe 2 b:
		/*
		BahnhofUtil<Bahnhof> bb=new BahnhofUtil<Bahnhof>(bahnhofBo);
		BahnhofUtil<Bahnhof> be=new BahnhofUtil<Bahnhof>(bahnhofEs); 
		
		bb.gibBahnhofBasisAus();
		be.gibBahnhofBasisAus();
		*/
		
		//Aufgabe 2 c:
		Supplier<String> ss=()->bahnhofEs.getName();
		BooleanSupplier bs=()->bahnhofEs.isMitBahnhofsgebaeude();
		
		System.out.println("Hat der Bahnhof "+ss.get()+" ein Gebuade? "+bs.getAsBoolean());
		
	}

}
