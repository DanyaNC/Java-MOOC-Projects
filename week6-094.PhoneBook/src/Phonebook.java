
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danya
 */
public class Phonebook {
    private ArrayList<Person> phoneBook = new ArrayList<Person>();
    
    public void add(String name, String number) {
        Person example = new Person(name, number);
        phoneBook.add(example);
    }
    
    public void printAll() {
        for(Person person: phoneBook) {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name) {
        String number = "";
        for(Person person : phoneBook) {
            if (person.getName().equals(name) ) {
                number = person.getNumber();
                break;
            }
        }
        if (number.isEmpty()) {
            return "number not known";
        } else {
            return number;
        }
        
    }
}
