package food.main;

import food.model.FoodOrder;
import food.model.RegularOrder;
import food.model.PremiumOrder;
import food.service.Discountable;
import food.utility.OrderUtility;

public class Main {
    public static void main(String[] args) {
        FoodOrder[] orders = new FoodOrder[6];
        orders[0] = new RegularOrder(1, "Aman", 500);
        orders[1] = new PremiumOrder(2, "Riya", 800);
        orders[2] = new RegularOrder(3, "Karan", 350);
        orders[3] = new PremiumOrder(4, "Sneha", 1200);
        orders[4] = new RegularOrder(5, "Vikram", 600);
        orders[5] = new PremiumOrder(6, "Neha", 950);

        for (FoodOrder order : orders) {
            if (!OrderUtility.validateAmount(order.getAmount())) continue;

            double delivery = order.calculateDeliveryCharge();
            double discount = ((Discountable) order).applyDiscount();
            double finalAmount = order.getAmount() - discount + delivery;

            System.out.println("Order " + order.getOrderId() + " | " + order.getCustomerName()
                + " | Bill: " + order.getAmount()
                + " | Discount: " + discount
                + " | Delivery: " + delivery
                + " | Final: " + finalAmount);
        }
        FoodOrder.displayTotalOrders();
    }
}