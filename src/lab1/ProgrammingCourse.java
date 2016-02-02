/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


/**
 *
 * @author Tim
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private String prerequisites;
    private double credits;
    
    public String GetCourseNumber(){
       return courseNumber; 
    };
    public abstract void setCourseNumber(String courseNumber);
    
    public double getCredits(){
        return credits;
    }
    
    public abstract void setCredits(double credits);
    
    public String getPrerequisites(){return prerequisites;}
    
    public abstract void setPrerequisites(String prerequisites);
    
}
