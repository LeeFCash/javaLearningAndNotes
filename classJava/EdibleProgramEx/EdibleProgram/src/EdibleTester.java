/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HMMohamed
 */
public class EdibleTester {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};

        for (Object obj : objects) {
            if (obj instanceof Edible) {
                System.out.println(((Edible) obj).howToEat());
            }
        }
    }
}
