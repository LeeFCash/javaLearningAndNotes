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
public class VehicleTester {
    public static void main(String[] args) {
        Car car1 = new Car(2,"Honda", "Civic", 2025);
        System.out.println(car1.start());
        System.out.println(car1.stop());
        ElectricCar eCar1 = new ElectricCar(60, 4, "Honda", "Accord", 2023);
        System.out.println(eCar1.getDetails());
        System.out.println(eCar1.checkBatteryStatus());
        System.out.println(eCar1.chargeBattery());
        System.out.println(eCar1.getBatteryPercentage());
        starting(car1);
        starting(eCar1);
    }
    public static void starting(Vehicle v){
        System.out.println(v.start());
    }
}
