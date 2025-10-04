/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author HMMohamed
 */
public class PeopleApp {

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.getName() + "     " + p1.getAge());
        
        Student s1 = new Student();
        System.out.println(s1.getName() + "   " + s1.getAge() + "    " +s1.getMajor());
        
        Person p2 = new Person("Adam", 22);
        
        Student s2= new Student("Sarah", 23, "Math");
        
        Employee e1 = new Teacher();
        
        Employee e2 = new Teacher("Mark", 34, 70000, "Math");
        
        System.out.println(p1.displayInfo());
        System.out.println(p2.displayInfo());
        System.out.println(s2.displayInfo());
        System.out.println(e2.displayInfo());
        
        Teacher t1 = new Teacher("Emily", 33, 66000,"Math");
        System.out.println(t1.displayInfo());
    }
}
