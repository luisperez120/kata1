package kata1;

import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        Person person;
        person = new Person("El Bolitas", new Date(98,8,19));
        System.out.println(person.getName() + " tiene " + person.getAge() + " anos");
    }
    
}
