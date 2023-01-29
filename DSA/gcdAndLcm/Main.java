package DSA.gcdAndLcm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first value : ");
        int a = scn.nextInt();
        System.out.println("enter second value : ");
        int b = scn.nextInt();
        scn.close();

        int tempa = a;
        int tempb = b;
        while(tempa%tempb != 0){
            int rem = tempa%tempb;
            tempa = tempb;
            tempb = rem;
        }

        int gcd = tempb;

        int lcm = (a*b)/gcd;
        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+lcm);

    }
}
