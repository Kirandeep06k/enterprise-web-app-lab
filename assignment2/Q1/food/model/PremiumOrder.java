package food.model;
import food.service.Discountable;

public class PremiumOrder extends FoodOrder implements Discountable {
    public PremiumOrder(int id, String name, double amount) {
        super(id, name, amount);
    }
    public double calculateDeliveryCharge() { return 50; }
    public double applyDiscount() { return getAmount() * 0.15; }
}