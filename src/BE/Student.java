/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 * 
 * @author robiesun
 */
public class Student extends Person{
    
   
  
    private String password = name;
   
    
    public Student(String name)
    {
        super(name);
        this.password = password;
    
    }

  

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
