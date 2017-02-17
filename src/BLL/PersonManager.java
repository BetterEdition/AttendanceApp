/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Person;
import BE.Student;
import BE.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robiesun
 */
public class PersonManager 
{
    private List<Person> persons = new ArrayList<>();
    private static PersonManager instance;
    
    public static PersonManager getInstance()
    {
        if(instance==null)
            instance = new PersonManager();
        return instance;
    }
    
    private PersonManager() // Singleton pattern
    {
    }
    
    public List<Teacher> getAllTeachers()
    {
        List<Teacher> listOfTeachers = new ArrayList<>();
        for (Person person : persons)
        {
            if(person.getClass()==Teacher.class)
            {
                listOfTeachers.add((Teacher)person);
            }
        }
        
        return listOfTeachers;
    }
    
    
    public List<Student> getAllStudents()
    {
        List<Student> listOfStudents = new ArrayList<>();
        for (Person person : persons)
        {
            if(person.getClass()==Student.class)
            {
                listOfStudents.add((Student)person);
            }
        }
        
        return listOfStudents;
    }
    
     public void addPerson(Person person)
    {
        if(!doesExist(person))
        {
            persons.add(person);
        }
    }
    
    public List<Person> getAllPersons()
    {
        return persons;
    }
 
    
    private boolean doesExist(Person person)
    {
        if(getPerson(person.getId())==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public Person getPerson(int id)
    {
        for (Person person : persons)
        {
            if(person.getId()==id)
            {
                return person;
            }
        }
        return null;
    }
}
