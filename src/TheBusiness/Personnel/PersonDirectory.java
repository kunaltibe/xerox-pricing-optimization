/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Personnel;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class PersonDirectory {
    
    ArrayList<Person> personlist ;
    
   
    public Person addNewPerson(Person p) {
        this.personlist.add(p);
        return p;
    }
   
    
    public PersonDirectory (){
       personlist = new ArrayList();
    }

    public Person newPerson(String id) {
        Person p = new Person(id);
        personlist.add(p);
        return p;
    }

    public Person findPerson(String id) {
        for (Person p : personlist) {
            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
    }
    
    
    @Override
    public String toString() {
        return "PersonDirectory{" + "personlist=" + personlist + '}';
    }
       
    
}
