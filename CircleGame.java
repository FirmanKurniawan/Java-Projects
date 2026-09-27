package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CircleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int n = sc.nextInt();
        System.out.println("Enter the key:");
        int k = sc.nextInt();
        int ans = circle(n,k);
        System.out.println("The winner is: "+ ans);
    }

    private static int circle(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i <= n; i++) {
            list.add(i);
        }
        int i=1;
        while (list.size()>1) {
            for(int t=0; t<k; t++) {
                i = (i+1)%n;
            }
            list.remove((i+1));
        }
        return list.get(0);
    }
}
