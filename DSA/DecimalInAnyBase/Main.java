package DSA.DecimalInAnyBase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = scn.nextInt();
        System.out.print("enter the value of base b : ");
        int b = scn.nextInt();
        scn.close();

        int ans = inAnyBase(n, b);
        System.out.println("in the required base : "+ans);
    }

    public static int inAnyBase(int n, int b) {
        int ans = 0;

        int power = 1;
        while(n>0){
            int rem = n%b;
            n = n/b;

            ans = ans + rem*power;
            power = power*10;
        }

        return ans;
    }
}
