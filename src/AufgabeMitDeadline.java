import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class AufgabeMitDeadline extends Aufgabe {

    private GregorianCalendar deadline;

    public AufgabeMitDeadline(String aufgabe, GregorianCalendar deadline) {
        super(aufgabe);
        this.deadline = deadline;
    }

    public GregorianCalendar getDeadline() {
        return deadline;
    }

    public void setDeadline(GregorianCalendar deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatieren = new SimpleDateFormat();
        return super.toString() + ", Deadline: " + formatieren.format(deadline.getTime());
    }
}
