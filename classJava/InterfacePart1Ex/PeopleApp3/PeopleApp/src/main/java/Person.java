/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
        return "name: " + name + " age: " + age;
    }
    @Override
    public String toString(){
        return  "Person name: " + name + " age: " + age;
    }
    @Override
    public boolean equals(Object otherObject){
        if(otherObject instanceof Person){
        Person other = (Person) otherObject;
        return this.name.equals(other.name) && this.age == other.age;
        } else{
            return false;
        }
    }
   
}
