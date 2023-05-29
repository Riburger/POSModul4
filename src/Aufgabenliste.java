import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabenliste {

    private ArrayList<Aufgabe> aufgabenliste;

    public Aufgabenliste() {
        this.aufgabenliste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
    }


    public void alleAufgabenAnzeigen(){
        for(Aufgabe aktuelleAufgabe : aufgabenliste){
            System.out.println(aktuelleAufgabe);
        }
    }

    public void aufgabeSuchen(String text){
        for (Aufgabe aufgabe : aufgabenliste){
            if (aufgabe.getAufgabe().contains(text)){
                System.out.println(aufgabe);
            }
        }
    }
    public void deadlinesAnzeigen(){
        SimpleDateFormat formatierer = new SimpleDateFormat("dd,MM,yyyy");
        for (Aufgabe aufgabe : aufgabenliste){
            if (aufgabe instanceof AufgabeMitDeadline){
                System.out.println(aufgabe);
                System.out.println(formatierer.format(((AufgabeMitDeadline) aufgabe).getDeadline().getTime()));



            }

        }
    }
    public void addAufgabe(Aufgabe aufgabe){
        aufgabenliste.add(aufgabe);
    }

    public void addAufgaBeDeadline(AufgabeMitDeadline aufgabeMitDeadline){

        aufgabenliste.add(aufgabeMitDeadline);
    }

    public void aufgabeErledigt(String text){
        for (Aufgabe aufgabe :aufgabenliste){
            if (aufgabe.getAufgabe().contains(text)){
                aufgabenliste.remove(aufgabe);
            }
        }
    }
}
