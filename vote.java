//Write a program to ask the user for their age and then print out whether they are eligible to vote (18 or older) or not.
import java.util.*;

public class vote{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("Your are Eligible for Vote");
        }
        else{
            System.out.println("Your are not Eligible for Vote");
        }
        sc.close();
    }
}
