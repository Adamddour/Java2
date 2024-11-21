package oopKlausur;

public enum GeometrischeFigur {

	
	KREIS(2, 0),
	DREIECK(2, 3),
	QUADRAT(2, 4),
	KUGEL(3, 0),
	WUERFEL(3, 8);
	
	private int dimension;
	private int anzahlEcken;
	
	
	GeometrischeFigur(int dimension,int anzahlEcken) {
		this.dimension=dimension;
		this.anzahlEcken=anzahlEcken;
	}
	
	public int getDimension() {
		return dimension;
	}
	
	public int getAnzahlEcken() {
		return anzahlEcken;
	}
	
	
	
}
