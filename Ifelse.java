import java .util.*;
class Ifelse{
    public static void main(String[] args){
        Scanner an = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int Age = an.nextInt();
        //voteing age 18 greter than eligible to vote
        if(Age>=18){
            System.out.println("You are Eligible to vote");
        }
        else{
            System.out.println("You are not Eligible to vote");
        }
    }
}
