package oopKlausur;

public class Seife extends Salbe {



	private String aroma;
	
	public Seife(int artikelnummer, String producktname, String preis, int vorraetig, int gewicht, float phWert,String aroma) {
		super(artikelnummer, producktname, preis, vorraetig, gewicht, phWert);
		this.aroma=aroma;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	@Override
	public String gibAttributeZurueck(){
		return super.gibAttributeZurueck()+"Seife [aroma=" + aroma + "]";
	}
	
	
	
}
