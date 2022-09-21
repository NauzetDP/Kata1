package kata1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 9, 1);
        
        Person p = new Person("Nauzet", date);
        System.out.println(p.getName() + " tiene " + p.getAge() + " años.");
    }
    
}
