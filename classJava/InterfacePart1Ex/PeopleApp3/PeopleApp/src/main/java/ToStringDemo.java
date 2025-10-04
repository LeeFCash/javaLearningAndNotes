
import java.awt.Rectangle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HMMohamed
 */
public class ToStringDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(1,2,3,4);
        System.out.println(box);
        
        Person person = new Person("Adam", 33);
        System.out.println(person);
        System.out.println(person.toString());
        
        Student s1 = new Student("Sarah", 25, "Biology");
        
        method(person);
        method(s1);
        method(box);
    }
    
    public static void method(Object p){
        System.out.println(p);
    }
}
