package DSA.benjaminBulbs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = scn.nextInt();
        scn.close();

        System.out.println("bulbs that are on after nth fluctuation are : ");
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
}
