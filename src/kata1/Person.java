package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (365.25 * 24 * 3600 * 1000);
    
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }
    
    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        LocalDate date = LocalDate.now();
        return Period.between(this.birthdate, date).getYears();
    }
    
    private long milliSecondsToYear(long milles) {
        return milles / MILLISECONDS_PER_YEAR;
    }
}
