import java.util.ArrayList;

public class JoeyOperation {
	public static ArrayList<AmountButtonInterface> amountButtons;
	public static PropertyButton lemon;
	public static PropertyButton newspaper;
	public static PropertyButton car;
	public static PropertyButton pizza;
	public static PropertyButton donut;
	public static PropertyButton shrimp;
	public static PropertyButton hockey;
	public static PropertyButton movie;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private boolean canBuy(int userMoney, int cost){
		return userMoney>cost;
	}
	
	public void priceScaling(PropertyButton button, int numberBought){
		double newPrice = Math.pow(1.08, numberBought)*button.getPrice();
		button.setPrice(newPrice);
	}
	
	public int calculateMax(double currentMoney, PropertyButton button){
		double cost = button.getPrice();
		int counter = 0;
		while(cost<currentMoney){
			cost = cost*1.08;
			counter++;
		}
		return counter;
	}
	
	public double projectedMaxPrice(int max,  PropertyButton button){
		return button.getPrice()*Math.pow(1.08, max);
	}
	
	public void generatePropertyButtons(){
		PropertyButton
	}

}
