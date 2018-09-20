package kata1;
import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person a = new Person("Alvaro",new Date(98,7,10));
        int años = a.getAge();
        System.out.println(a.getName() + " ha nacido en: " + a.getBirthdate());
        System.out.println("Sa edad es: " + años);
    }
    
}
