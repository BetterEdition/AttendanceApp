/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.Model.WeekPlanModel;

/**
 *
 * @author robiesun
 */
public class WeekManager {
    
    private final WeekPlanModel model = WeekPlanModel.getWeekPlanModel();
    
    private String subject;
    private double time;
   
      public WeekManager(String s, double t)
    {
        this.subject = s;
        this.time = t;
    }
    
    public String toString()
    {
        return getSubject() + "\t" + getTime();
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
    }

    public String getSubject() {
        return subject;
    }

    public double getTime() {
        return time;
    }
            
  
    
}
