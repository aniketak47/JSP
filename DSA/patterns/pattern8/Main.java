package pattern8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = scn.nextInt();
        scn.close();

        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print("  ");
            }
            System.out.println("* ");
        }
    }
}
