package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person p = new Person("Nauzet", new Date(102,9,9));
        System.out.println(p.getName() + " tiene " + p.getAge() + " años.");
    }
    
}