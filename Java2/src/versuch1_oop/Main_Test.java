package versuch1_oop;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class Main_Test {

	public static void main(String[] args) {
		
		/*ImplementTest_1 ob1=new ImplementTest_1();
		
		System.out.println(ob1.halloSagen());*/
		Test_1 ob1;
		
		/*ob1=()->"Test";
		 String ergebnis=ob1.halloSagen();
		 System.out.println(ergebnis);*/
		
		/*ob1=()->{
			return "Test11111";
		};*/
		
		/*ob1=()->"Test22222";
		
		System.out.println(ob1.halloSagen());
		*/
		
		BooleanSupplier b=()->true;
		System.out.println(b.getAsBoolean());
		
		Supplier<String> ss=()->"ttttttt"; 
		System.out.println(ss.get());
		
		DoubleSupplier db=()->20.5;
		System.out.println(db.getAsDouble());
		
		

	}
	
}
