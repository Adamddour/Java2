package versuch3_datenstruckten;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.LinkedList;
	import java.util.Random;
	import java.util.Scanner;

	public class TitleApp {
	    public static void main(String[] args) {
	        LinkedList<Title> titleList = new LinkedList<>();
	        String cdName = "";

	        try {
	            File file = new File("titleList.txt");
	            Scanner scanner = new Scanner(file);

	            if (scanner.hasNextLine()) {
	                cdName = scanner.nextLine(); // Name der CD (erste Zeile der Datei)
	            }

	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                String[] values = line.split(";");

	                if (values.length == 5) {
	                    int cdNr = extractCdNumber(values[0]);
	                    int trackNr = Integer.parseInt(values[1]);
	                    String interpret = values[2];
	                    String title = values[3];
	                    String durance = values[4];

	                    Title titleObj = new Title(cdNr, trackNr);
	                    titleObj.setName(cdName);
	                    titleObj.setInterpret(interpret);
	                    titleObj.setTitle(title);
	                    titleObj.setDurance(durance);

	                    titleList.add(titleObj);
	                }
	            }

	            scanner.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	        // Generiere eine Zufallszahl zwischen 0 und Größe der Liste
	        Random random = new Random();
	        int randomIndex = random.nextInt(titleList.size());

	        // Lese das zufällige Title-Objekt aus der Liste
	        Title randomTitle = titleList.get(randomIndex);

	        // Gib das ausgewählte Title-Objekt im gewünschten Format aus
	        System.out.println(randomTitle.getName());
	        System.out.println("CD Nr: " + randomTitle.getCdNr());
	        System.out.println("Titel Nr.: " + randomTitle.getTrackNr());
	        System.out.println("Interpret: " + randomTitle.getInterpret());
	        System.out.println("Titel: " + randomTitle.getTitle());
	        System.out.println("Spielzeit: " + randomTitle.getDurance());
	    }

	    private static int extractCdNumber(String cdNr) {
	        String number = cdNr.replaceAll("[^\\d]", ""); // Entferne alle Nicht-Ziffern
	        return Integer.parseInt(number);
	    }
    
	

}


