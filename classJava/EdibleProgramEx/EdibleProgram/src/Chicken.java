/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HMMohamed
 */
public class Chicken extends Animal implements Edible {

    public String soud() {
        return "Chicken: Cluck";
    }

    public String howToEat() {
        return "Chicken: Grill";
    }
}
