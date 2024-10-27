package Operators.Logicalopertor;

public class LogicalOR {
    public static void main(String[] args) {
        int age = 65;
        
        // Check if age is below 18 or above 60 to apply a discount
        if (age < 18 || age > 60) {
            System.out.println("Eligible for discount");
        } else {
            System.out.println("Not eligible for discount");
        }
    }
}
