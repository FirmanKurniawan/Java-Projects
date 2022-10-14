import java.util.Scanner;
 
/**
 * Java program to calculate area of a circle
 */
public class AreaOfCircle {
     
    public static void main(String[] args) {
        System.out.print("Enter radius of circle: ");
        Scanner sn = new Scanner(System.in);
        Double radius = sn.nextDouble();
         
        Double area = Math.PI * radius * radius;        
        System.out.println("Area = "+area);
    }
}