import java.util.*;
public class divided{
        public static void main(String[] args) {
        
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Number: ");
            int Number = sc.nextInt();

            if(Number % 5==0 && Number % 3==0){
                System.out.println("Divisible by Both: ");
            }else if(Number %  5==0){
                System.out.println("Divisible by 5: ");
            }
            else if(Number %  3==0){
                System.out.println("Divisible by 3: ");
            }
        else {
            System.out.println("Not divisible by 5 or 3");
        }


        
    }
    
}
/* 1. Write a program to check if a number is divisible by 5 or 3, 
and print "Divisible by 5" or "Divisible by 3" accordingly. I
f it's divisible by both, print "Divisible by 5 and 3".
*/