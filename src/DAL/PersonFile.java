/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Person;
import BE.Student;
import BLL.PersonManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robiesun
 */
public class PersonFile {
   
    
    public void startPersonFile()
    {
        PersonManager personManager = PersonManager.getInstance();
        
        Student name = new Student("Robie");
       
      
        personManager.addPerson(name);
    }
    
}
