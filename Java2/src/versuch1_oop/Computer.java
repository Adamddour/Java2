package versuch1_oop;


public abstract class Computer implements Wechsel {

	private String kabel;
    private String einAusSchalter;
    private String computerMarke;
    
    
 


	public Computer(String kabel, String einAusSchalter) {
        this.kabel = kabel;
        this.einAusSchalter = einAusSchalter;
    }
    
    
    public String getKabel() {
        return kabel;
    }

    public String getEinAusSchalter() {
        return einAusSchalter;
    }
    
    
    public String getComputerMarke() {
 		return computerMarke;
 	}


 	public void setComputerMarke(String computerMarke) {
 		this.computerMarke = computerMarke;
 	}
    
    public String wechseln(String teil) {
    	 if (teil.equalsIgnoreCase("kabel")) {
             kabel = "neu";
             return "Kabel wurde gewechselt.";
         } else if (teil.equals("einAusSchalter")) {
             einAusSchalter = "neu";
             return "Ein-Aus-Schalter wurde gewechselt.";
         } else {
             return "Dieses Teil kann nicht gewechselt werden.";
         }
    }
	
    public abstract void ausgabe();
}
