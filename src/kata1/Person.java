package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Logger;
import sun.util.calendar.Gregorian;



public class Person {
private final String name; 
private final Calendar birthdate;
private static final long miliseconds_per_year
        = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        Calendar today= GregorianCalendar.getInstance();
        return (int) (miliSecondsToYear(today.getTimeInMillis()- birthdate.getTimeInMillis()));
        
  
    }
    
    public long miliSecondsToYear(long milles){
        return milles /miliseconds_per_year;
        
    }
    
    
            
    
    
    
    

}
