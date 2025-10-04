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
public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle() {
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getDetails(){
        return "Make: " + make + " MOdel: " + model + " Year: " + year;
    }
    public String start(){
        return "Vehicle is starting";
    }
    public String stop(){
        return "Vehicle is stopping";
    }
}
