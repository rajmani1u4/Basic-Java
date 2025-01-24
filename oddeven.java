import java.util.Scanner;

public class oddeven {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int Number = sc.nextInt();
        
        if(Number % 2==0){
            System.out.println("It is Even Number");
        }
        else{
                System.out.println("it is Odd Number");
            }
        }

    }

