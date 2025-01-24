import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Radius of circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * Math.pow(radius,2);
    
        System.out.println("Area Of Circle is : " + area);

        sc.close();
    }
}
        
