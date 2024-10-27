package Operators.Logicalopertor;

class BitwiseAND{
     public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        // Both sides are evaluated, even if `a` is not less than 5
        if (a < 5 & b++ < 10) {
            System.out.println("Both conditions are true");
        } else {
            System.out.println("At least one condition is false");
        }
        System.out.println("Value of b: " + b); // b is incremented to 6
    }

}