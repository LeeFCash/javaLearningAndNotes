/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HMMohamed
 */
public class Student extends Person{
    private String major;
    
    public Student(){
        
    }
    public Student(String name, int age, String major){
        super(name,age);
        this.major = major;
        
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
    public String displayInfo(){
        //return super.displayInfo() + " Major: " + major;
        return "Student name: " + this.getName() + " age: " + this.getAge()+" major: " + major;
    }
    @Override
    public String toString(){
        return  "Student name: " + getName() + " age: " + getAge()+ " major: " + major;
    }
    
}
