package food.utility;

public class OrderUtility {
    public static boolean validateAmount(double amount) {
        return amount > 0;
    }
    public static boolean validateCustomerName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}