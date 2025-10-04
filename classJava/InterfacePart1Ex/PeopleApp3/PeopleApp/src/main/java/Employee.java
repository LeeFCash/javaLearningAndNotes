/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HMMohamed
 */
public abstract class Employee extends Person{
    private double salary;
    
    
    public Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public String displayInfo(){
        return super.displayInfo() + " salay: " + salary;
    }
    public Employee(){
        
    }
     public abstract void doDuty();
}
