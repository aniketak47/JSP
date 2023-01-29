package pattern3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = scn.nextInt();
        scn.close();

        for(int i=0;i<n;i++){
            for(int space=0;space<n-i-1;space++){
                System.out.print("  ");
            }
            for(int star=0;star<=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
