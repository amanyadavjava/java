package patterns;

import java.util.Scanner;

public class RevHollowRightTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                if (i == 0 || i == n-1 || j == 1 || j == n-i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}