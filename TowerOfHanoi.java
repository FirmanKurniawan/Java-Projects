package recursion;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of discs:");
        int n= sc.nextInt();
        int steps = hanoi(n);
        System.out.println(steps);
    }

    private static int hanoi(int n) {
        return recursion(n, 1, 3, 2);
    }

    private static int recursion(int n, int s, int d, int a) {
        int steps=0;
        if(n>=1) {
            steps += recursion(n-1, s, a, d);
            System.out.println("Move a disc from "+ s+ " to "+ d);
            steps++;
            steps += recursion(n-1,a,d,s);
        }
        return steps;
    }
}
