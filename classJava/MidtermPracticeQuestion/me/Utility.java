public abstract class Utility implements Taxable {
	private static final double PERCENT = 0.99;
	public static double totalTax(Taxable[] elements) {
		double total = 0;
		for(Taxable t : elements) {
			total += t.calculateTax();
		}
		return total * PERCENT;
	}
}
