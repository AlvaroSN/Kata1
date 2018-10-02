package kata1;
import java.time.LocalDate;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate x = LocalDate.of(1998, Month.AUGUST, 10);
        Person a = new Person("Alvaro", x);
        int años = a.getAge();
        System.out.println(a.getName() + " ha nacido en: " + a.getBirthdate());
        System.out.println("Sa edad es: " + años);
    }
    
}
