/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HMMohamed
 */
public class Employee extends Person implements Measurable{
    private double salary;

    public Employee(double salary, String name, int age) {
        super(name, age);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
//    public String displayInfo(){
//        return "Employee: " + super.displayInfo()+" salary: " + salary;
//    }
    public String toString(){
        return "toString in Emplyee: name: " + getName() + " age: " + getAge()+" salary: " + getSalary();
    }
    
    public double getMeasure(){
        return salary;
    }
    
}
