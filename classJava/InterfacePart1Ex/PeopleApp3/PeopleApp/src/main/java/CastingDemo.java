/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HMMohamed
 */
public class CastingDemo {

    public static void main(String[] args) {

        Person p1 = new Person("Emily", 45);
        Person p2 = new Student("Emily", 45, "Math");
        
        Student s2 = (Student)p2;
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getMajor());
    }
}
