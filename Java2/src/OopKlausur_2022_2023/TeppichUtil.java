package OopKlausur_2022_2023;

public class TeppichUtil <T extends Teppich>{

	private T teppichBasis;

	public TeppichUtil(T teppichBasis) {
		
		this.teppichBasis = teppichBasis;
	}
	
	public void gibAttributeUndQuadratmeterTeppichBasisInKonsoleAus(){
		
		System.out.println(teppichBasis.gibAttributeAus(" ")+" Anzahl:"+teppichBasis.getBreite()*teppichBasis.getBreite());
	} 
	
	
	
}
