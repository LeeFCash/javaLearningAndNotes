import java.util.ArrayList;
public class TaxableTester {
	public static void main(String[] args) {
		Taxable[] houses = {new House("id1",20.00), new House("id2",21.00), new House("id3",22.00)};
		System.out.println(Utility.totalTax(houses));
		Taxable[] items = new Taxable[3];
		items[0] = new Item("code1",1.00);
		items[1] = new Item("code2",2.00);
		items[2] = new Item("code3",3.00);
		System.out.println(Utility.totalTax(items));
	}
}
