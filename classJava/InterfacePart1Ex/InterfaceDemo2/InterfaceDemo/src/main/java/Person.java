/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HMMohamed
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public String displayInfo(){
        return "Person: name: " + name + " age: " + age;
    }
    public String toString(){
        return "toString in Person: name: " + name + " age: " + age;
    }
    
    public boolean equals(Object otherObject){
        Person other = (Person)otherObject;
        return this.name.equals(other.name) && this.age==other.age;
    }
    
    
}
