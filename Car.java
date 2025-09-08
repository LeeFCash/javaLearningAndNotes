public class Car {
    private String make = "chevrolet";
    private String model = "corvette";
    private int year = 2020;
    private String color = "blue";
    private double price = 50000.00;
/* how to without setter 
    Car(String make, String model, int year){
    	this.make = make;
    	this.model = model;
    	this.year = year;
    }
*/
    // with setters 
    Car(String make, String model, int year){
    	this.setMake(make);
    	this.setModel(model);
    	this.setYear(year);
    }
    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
//  setter 
    public void setMake(String make) {
	    this.make = make;
    }
    public void setModel(String model) {
	    this.model = model;
    }
    public void setYear(int year) {
	    this.year = year;
    }

    public void drive() {
        System.out.println("drive the car");
    }

    public void brake() {
        System.out.println("step on the brakes");
    }
}
