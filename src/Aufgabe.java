import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Aufgabe {

    private String aufgabe;

    private GregorianCalendar erstellungsDatum;

    public Aufgabe(String aufgabe) {
        this.aufgabe = aufgabe;
        this.erstellungsDatum = new GregorianCalendar();
    }

    public String getAufgabe() {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe) {
        this.aufgabe = aufgabe;
    }

    public GregorianCalendar getErstellungsDatum() {
        return erstellungsDatum;
    }

    public void setErstellungsDatum(GregorianCalendar erstellungsDatum) {
        this.erstellungsDatum = erstellungsDatum;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatieren = new SimpleDateFormat();
        return "Aufgabe: " + aufgabe + ", Erstellungsdatum: " + formatieren.format(erstellungsDatum.getTime());

    }
}
