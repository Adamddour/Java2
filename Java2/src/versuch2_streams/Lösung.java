package versuch2_streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lösung{
    public static void main(String[] args) {
        try {
            // Öffnen der Eingabedatei
            BufferedReader in = new BufferedReader(new FileReader("zitate.xml"));

            // Öffnen der Ausgabedatei
            PrintWriter out = new PrintWriter(new FileWriter("Zitate.txt"));

            // Variablen zur Speicherung des aktuellen Namens und der Beschreibung
            String name = "";
            String beschreibung = "";

            // Lesen der Eingabedatei zeilenweise
            String zeile;
            while ((zeile = in.readLine()) != null) {
                // Suche nach dem Namen der Person
                if (zeile.contains("<name>")) {
                    name = extrahiereInhalt(zeile, "name");
                }

                // Suche nach der Beschreibung der Person
                if (zeile.contains("<beschreibung>")) {
                    beschreibung = extrahiereInhalt(zeile, "beschreibung");
                }

                // Suche nach einem Zitat der Person
                if (zeile.contains("<zitat>")) {
                    String zitat = extrahiereInhalt(zeile, "zitat");
                    // Ausgabe des Zitats in der gewünschten Form
                    out.println("\"" + zitat + "\"");
                    out.println(name + ", " + beschreibung);
                    out.println();
                }
            }

            // Schließen der Eingabe- und Ausgabedatei
            in.close();
            out.close();

            System.out.println("Extrahieren der Zitate erfolgreich abgeschlossen.");

        } catch (IOException e) {
            System.err.println("Fehler beim Lesen oder Schreiben der Datei: " + e.getMessage());
        }
    }

    /**
     * Extrahiert den Inhalt eines Tags aus einer Zeile.
     * @param zeile die Zeile, die den Tag enthält
     * @param tag der Name des Tags
     * @return der Inhalt des Tags (ohne "<" und ">")
     */
    private static String extrahiereInhalt(String zeile, String tag) {
        int start = zeile.indexOf("<" + tag + ">") + tag.length() + 2;
        int ende = zeile.indexOf("</" + tag + ">");
        return zeile.substring(start, ende);
    }
}
