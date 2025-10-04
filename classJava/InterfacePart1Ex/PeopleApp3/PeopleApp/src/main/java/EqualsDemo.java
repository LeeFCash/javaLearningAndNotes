
import java.awt.Rectangle;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HMMohamed
 */
public class EqualsDemo {
    public static void main(String[] args) {
        String text1 = "Chattanooga";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text2 = in.next();
        if(text1 == text2){
            System.out.println("Equals");
        } else{
            System.out.println("Not equals");
        }
        
        System.out.println("To fix");
        if(text1.equals(text2)){
            System.out.println("Equals");
        } else{
            System.out.println("Not equals");
        }
        
        System.out.println("-------Rectangle Example-------------------");
        Rectangle box1 = new Rectangle(10,20,5,9);
        Rectangle box3 = new Rectangle(10,20,5,9);
        System.out.println(box1 == box3);
        System.out.println(box1.equals(box3));
        
        System.out.println("-------Testing out equals methods------");
        Person p1 = new Person("Mark", 33);
        Person p2 = new Person("Mark", 33);
        Person p3 = new Person("Mark", 22);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(box1));
        
        Teacher t1 = new Teacher("Tim", 25, 77000, "Math");
        Teacher t2 = new Teacher("Tim", 25, 74000, "Biology");
        System.out.println(t1.equals(t2));
        
    }
    
}
