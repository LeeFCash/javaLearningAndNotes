public class Car {
    private String make = "chevrolet";
    private String model = "corvette";
    private int year = 2020;
    private String color = "blue";
    private double price = 50000.00;

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void drive() {
        System.out.println("drive the car");
    }

    public void brake() {
        System.out.println("step on the brakes");
    }
}
