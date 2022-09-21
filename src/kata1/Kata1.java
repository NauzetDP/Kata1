package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2002, 5, 1);
        
        Person p = new Person("Nauzet", date);
        System.out.println(p.getName() + " tiene " + p.getAge() + " años.");
    }
    
}
