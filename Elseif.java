import java.util.*;
class Elseif{
    public static void main(String[] args){
        Scanner an  = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = an . nextInt();
        

if (number > 0) {
    System.out.println("The number is positive.");
} else if (number < 0) {
    System.out.println("The number is negative.");
} else {
    System.out.println("The number is zero.");
}
    }
}