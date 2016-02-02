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
    String courseName;
    String courseNumber;
    String prerequisites;
    double credits;
    
    public String GetCourseNumber(){
       return courseNumber; 
    };
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract double getCredits();
    
    public abstract void setCredits(double credits);
    
    public abstract String getPrerequisites();
    
    public abstract void setPrerequisites(String prerequisites);
    
}
