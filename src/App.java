import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aufgabenliste aufgabenliste = new Aufgabenliste();
        boolean laeuft = true;
        while (laeuft){
        System.out.println("******** Liste XXX bearbeiten *******");
        System.out.println("1) Alle Aufgaben anzeigen");
        System.out.println("2) Aufgaben durchsuchen");
        System.out.println("3) Deadlines anzeigen");
        System.out.println("4) Neue Aufgabe hinzufügen");
        System.out.println("a) Standard-Aufgabe");
        System.out.println("b) Aufgabe mit Deadline (incl. Benachrichtigung)");
        System.out.println("5) Aufgabe erledigt");
        System.out.println("x) Beenden");
        System.out.println("**********************************");
        System.out.println("Bitte wähle eine Option:");
        String auswahl = scanner.nextLine();

        switch (auswahl){

            case "1":

                aufgabenliste.alleAufgabenAnzeigen();
                break;
            case "2":
                System.out.println("Bitte geben Sie einen Text passend zur Aufgabe ein.");
                String suchText = scanner.nextLine();
                aufgabenliste.aufgabeSuchen(suchText);
                break;

            case "3":
                aufgabenliste.deadlinesAnzeigen();
                break;

            case "a":
                System.out.println("Bitte neue Aufgabe eingeben.");
                String inhaltAufgabe = scanner.nextLine();
                Aufgabe aufgabeNeu = new Aufgabe(inhaltAufgabe);
                aufgabenliste.addAufgabe(aufgabeNeu);
                break;

            case "b":
                System.out.println("Bitte Text für die neue Aufgabe eingeben: ");
                String inhaltAufgabeMitDead = scanner.nextLine();
                System.out.println("Bitte Deadline eingeben (Format: dd.MM.yyyy): ");
                String deadline = scanner.nextLine();
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                try {
                    Date datum = format.parse(deadline);
                    GregorianCalendar calender = new GregorianCalendar();
                    calender.setTime(datum); // Setzen Sie das Datum des Kalenders auf das eingegebene Datum.
                    AufgabeMitDeadline aufgabeMitDeadline = new AufgabeMitDeadline(inhaltAufgabeMitDead, calender);
                    aufgabenliste.addAufgabe(aufgabeMitDeadline);
                    System.out.println("Aufgabe mit Deadline wurde erfolgreich hinzugefügt!");
                } catch (ParseException e) {
                    System.out.println("Fehlerhafte Eingabe. Bitte geben Sie das Datum im Format dd.MM.yyyy ein.");
                }
                break;

            case "5":

                break;

            case "x":
                laeuft = false;




            }
        }




        AufgabeMitDeadline amd1 = new AufgabeMitDeadline("Geburtstag", new GregorianCalendar(2023, GregorianCalendar.JUNE, 05));

        aufgabenliste.addAufgabe(amd1);
        aufgabenliste.deadlinesAnzeigen();

    }
}
