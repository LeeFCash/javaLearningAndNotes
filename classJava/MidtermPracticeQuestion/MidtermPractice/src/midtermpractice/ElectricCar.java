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
public class ElectricCar extends Car implements Electric{
    private int batteryPercentage;

    public ElectricCar() {
    }
   
    public ElectricCar(int batteryPercentage, int numberOfDoors, String make, String model, int year) {
        super(numberOfDoors, make, model, year);
        this.batteryPercentage = batteryPercentage;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
    
    public String chargeBattery(){
        batteryPercentage = 100;
        return "Battery is fully charged";
    }
    public String checkBatteryStatus(){
        String batteryStatus;
        if (batteryPercentage < 20){
            batteryStatus = "Battery is low";
        } else {
            batteryStatus = "Battery is fully charged";
        }
        return batteryStatus;
    }
    
    
    
}
