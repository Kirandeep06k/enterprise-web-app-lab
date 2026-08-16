package food.model;
import food.service.Discountable;

public class RegularOrder extends FoodOrder implements Discountable {
    public RegularOrder(int id, String name, double amount) {
        super(id, name, amount);
    }
    public double calculateDeliveryCharge() { return 80; }
    public double applyDiscount() { return getAmount() * 0.10; }
}