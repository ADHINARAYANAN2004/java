// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class DataTypeExample {
    public static void main(String[] args) {
        
        // Primitive Data Types
        
        // Integer types
        byte smallNumber = 100;  
        short shortNumber = 20000;  
        int intNumber = 50000;  
        long longNumber = 1000000000L;  
        
        // Floating point types
        float floatNumber = 19.95f;  
        double doubleNumber = 99.99;  
        
        // Character type
        char letter = 'A';  
        
        // Boolean type
        boolean isJavaFun = true;
        
        // Non-Primitive Data Types
        
        // String type
        String name = "Alice";  
        
        // Array type
        int[] numbers = {10, 20, 30, 40};  // Array of integers
        
        // Output the values
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + intNumber);
        System.out.println("long: " + longNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isJavaFun);
        
        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("String: " + name);
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
    }
}
