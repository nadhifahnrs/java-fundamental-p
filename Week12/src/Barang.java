public class Barang {
	private ServicePackage servicePackage;
	private City city;
	private long weight, quantity, priceItem;
	private String productName;
	
	@Override
	public String toString() {
		return "Barang{" + productName + " | " + quantity + " | " + weight + " | "
				+ city.getDestination() + " | " + servicePackage.getService() + " | "
				+ servicePackage.getValue() + " | " + ((priceItem*quantity) + servicePackage.getValue());
	}
}
