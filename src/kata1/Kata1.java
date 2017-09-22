package kata1;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Kata1 {
    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1998, 8, 19);
        Person person;
        person = new Person("El Bolitas", date );
        System.out.println(person.getName() + " tiene " + person.getAge() + " anos");
    }
    
}
