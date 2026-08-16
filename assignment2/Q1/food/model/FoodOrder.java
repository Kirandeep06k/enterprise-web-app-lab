package food.model;
public abstract class FoodOrder {
    private int orderId;
    private String customerName;
    private double amount;
    //private static String restaurantName = "Tasty Bites";
    private static int orderCounter = 0;

    public FoodOrder(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        orderCounter++;
    }

    public int getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getAmount() { return amount; }

    public static void displayTotalOrders() {
        System.out.println("Total Orders: " + orderCounter);
    }

    public abstract double calculateDeliveryCharge();
}