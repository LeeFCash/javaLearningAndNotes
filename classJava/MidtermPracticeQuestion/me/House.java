public class House implements Taxable {
	public String id;
	public double value;
	public House(String id, double value){
		this.id = id;
		this.value = value;
	}
	public String getId(){
		return id;
	}
	public double getValue(){
		return value;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setValue(double value){
		this.id = id;
	}
	public double calculateTax() {
		return value;
	}
}
