package DSA.AnyBasetoDecimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = scn.nextInt();
        System.out.println("enter the value of base b : ");
        int b = scn.nextInt();
        scn.close();

        int ans = getValueInDecimal(n,b);
        System.out.println("decimal value is : "+ ans);
    }

    public static int getValueInDecimal(int n, int b) {
        int ans = 0;

        int power = 1;
        while(n>0){
            int rem = n%10;
            n = n/10;

            ans = ans + rem*power;
            power = power * b;
        }

        return ans;
    }
}
