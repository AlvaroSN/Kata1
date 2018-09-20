package kata1;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1998,8,10);
        Person a = new Person("Alvaro", date);
        int años = a.getAge();
        System.out.println(a.getName() + " ha nacido en: " + a.getBirthdate());
        System.out.println("Sa edad es: " + años);
    }
    
}
