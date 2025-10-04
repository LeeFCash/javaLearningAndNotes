/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermpractice;

/**
 *
 * @author HMMohamed
 */
public class Car extends Vehicle{
    
    private int numberOfDoors;

    public Car() {
    }

    public Car(int numberOfDoors, String make, String model, int year) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public String getDetails(){
        return super.getDetails() + " Number of Doors: " + numberOfDoors;
    }
    public String start(){
        return "Car is starting";
    }
    public String stop(){
        return "Car is stopping";
    }
}
