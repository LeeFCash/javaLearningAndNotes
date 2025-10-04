/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HMMohamed
 */
public class Teacher extends Employee {
    private String subject;
    
    public Teacher(){
        
    }
    public Teacher(String name, int age, double salary, String subject){
        super(name,age,salary);
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    public String displayInfo(){
        return super.displayInfo() + " subject: " + subject;
    }
    public boolean equals(Object otherObject){
        if(otherObject instanceof Teacher){
        Teacher other = (Teacher) otherObject;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge() &&
                this.getSalary() == other.getSalary() && this.subject.equals(other.subject);
        } else{
            return false;
        }
    }
     public void doDuty(){
         System.out.println("Do grading");
     }
}
