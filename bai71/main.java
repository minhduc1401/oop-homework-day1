package bai71;

public class main {
	public static void main(String[] args) {
		Customer cus = new Customer("Bin", true, "Gold");
		DiscountRate dr = new DiscountRate();
		System.out.println("Product Discount Rate:"+dr.getProductDiscountRate(cus.getMemberType()));
		System.out.println("Service Discount Rate:"+dr.getServiceDiscountRate(cus.getMemberType()));
		
	}
}
