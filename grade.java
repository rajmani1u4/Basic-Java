/* Given a student's marks in three subjects, determine their grade:
- Average 90-100: A
    - Average 80-89: B
    - Average 70-79: C
    - Average 60-69: D
    - Average below 60: F
*/
import java.util.Scanner;

public class grade{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks1: ");
        double Mark1 = sc.nextDouble();

        System.out.println("Enter your Marks2: ");
        double Mark2 = sc.nextDouble();

        System.out.println("Enter your Marks3: ");
        double Mark3 = sc.nextDouble();

        double Average =Mark1+Mark2+Mark3/3;

        if(Average >= 90){
            System.out.println("Your Grade is: A");
        }
        else if(Average >=80){
            System.out.println("Your Grade is: B");
        }
        else if(Average >=70){
            System.out.println("Your Grade is: C");
        }
        else if(Average >=60){
            System.out.println("Your Grade is: D");
        }
        else{
            System.out.println("Your Grade is: F");
        }
     sc.close();
    }
}