package kata1;

import java.util.Date;
import java.util.logging.Logger;



public class Person {
private final String name; 
private final  Date birthdate;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
            return (int) ((new Date().getTime() -
                    birthdate.getTime()) /31536000000L);
    }
    
    
            
    
    
    
    

}
