package versuch1_oop;


public class Asus extends Computer {

	public Asus(String kabel, String einAusSchalter) {
        super(kabel, einAusSchalter);
        setComputerMarke("Asus");
    }
	
	
	 public String wechseln(String teil) {
	        return super.wechseln(teil) + "\n"+"Beim Asus ist neu: " + teil ;
	    }
	 
	 public void ausgabe() {
	        System.out.println("Kabel: " + super.getKabel());
	        System.out.println("Ein-Aus-Schalter: " + super.getEinAusSchalter());
	    }
}
