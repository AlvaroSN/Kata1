package kata1;
import java.time.Period;
import java.time.LocalDate;



 public class Person {
    private final String name;
    private final LocalDate birthdate;
   
    public Person (String name, LocalDate birthdate){
        this.name = name;
        this.birthdate= birthdate;
    }
   
    public String getName (){
        return name;
    }
    
    public LocalDate getBirthdate (){
        return birthdate;
    }
    
    public int getAge(){
        LocalDate today = LocalDate.now();
        int x = (Period.between(birthdate,today)).getYears();
        return x;
    }
    
}

