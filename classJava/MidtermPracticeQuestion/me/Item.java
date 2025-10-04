public class Item implements Taxable {
	public String code;
	public double price;
	public Item(String code, double price){
		this.code = code;
		this.price = price;
	}
	public String getCode(){
		return code;
	}
	public double getPrice(){
		return price;
	}
	public void setCode(String code){
		this.code = code;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double calculateTax() {
		return price;
	}
}
