package versuch1_oop;


public class ComputerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asus asus=new Asus("alt", "alt");
		
		System.out.println("ComputerMarke: " + asus. getComputerMarke());
		System.out.println(asus.wechseln("einAusSchalter"));
		asus.ausgabe();
	}

}
