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
public abstract class Person {
    
    private static int idGenerator = 0;
    String name;
    private String email;
    private int id;
    
    public Person(String name)
    {
        this.name = name;
        this.id = idGenerator++;
    }
    
    @Override
    public String toString()
    {
        return getName() + "\t" + getId() + "\t" + getEmail();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}
