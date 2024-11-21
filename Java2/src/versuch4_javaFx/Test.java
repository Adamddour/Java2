package versuch4_javaFx;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br= new BufferedReader(new FileReader("bundesliga.csv"));
			String zeile;
			
			while((zeile=br.readLine()) !=null) {
				Scanner sc= new Scanner(zeile);
			     sc.useDelimiter(";");
			    String verein= sc.next();
			    
			    int gesamtpunkte=0;
			    
			    while(sc.hasNext()) {
			    	String spiel=sc.next();
			    	Scanner s=new Scanner(spiel);
			    	 s.useDelimiter(":");
		
					 int treffer= s.nextInt();
					int gegentreffer= s.nextInt();
					
					if(treffer>gegentreffer) {
						gesamtpunkte +=3;
					}else if(treffer<gegentreffer) {
						gesamtpunkte +=1;
					}
			    }
				
				System.out.println(verein+ " hat Gesamtpunkte von "+ gesamtpunkte);
				
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}