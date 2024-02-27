package bai71;

public class DiscountRate {
	private double serviceDiscountPremium =0.2;
	private double serviceDiscountGold =0.15;
	private double serviceDiscountSilver =0.1;
	private double productDiscountPremium =0.1;
	private double productDiscountGold =0.1;
	private double productDiscountSilver =0.1;
	
	public double getServiceDiscountRate(String memberType) {
		if (memberType.equals("Premium")) {
			return serviceDiscountPremium;
		}else if (memberType.equals("Gold")) {
			return serviceDiscountGold;
		}else if (memberType.equals("Silver")) {
			return serviceDiscountSilver;
		}else {
			return 0;
		}
	}
	public double getProductDiscountRate(String memberType) {
		if (memberType.equals("Premium")) {
			return productDiscountPremium;
		}else if (memberType.equals("Gold")) {
			return productDiscountGold;
		}else if (memberType.equals("Silver")) {
			return productDiscountSilver;
		}else {
			return 0;
		}	
	}
}
