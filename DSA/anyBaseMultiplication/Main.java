package DSA.anyBaseMultiplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value of base : ");
        int b = scn.nextInt();
        System.out.println("enter the first value n1 : ");
        int n1 = scn.nextInt();
        System.out.println("enter the second value n2 : ");
        int n2 = scn.nextInt();
        scn.close();

        int ans = anyBaseMultiplication(b, n1, n2);
        System.out.println("multiplied value is : "+ans);
    }

    public static int anyBaseMultiplication(int b, int n1, int n2) {
        int n1InDecimal = anyBaseToDecimal(n1, b);
        int n2InDecimal = anyBaseToDecimal(n2, b);
        int n = n1InDecimal * n2InDecimal;
        int ans = decimalToAnyBase(n, b);
        return ans;
    }

    public static int anyBaseToDecimal(int n, int b) {
        int ans = 0;

        int power = 1;
        while(n>0){
            int rem = n%10;
            n = n /10;

            ans = ans + rem*power;
            power = power * b;
        }

        return ans;
    }

    public static int decimalToAnyBase(int n, int b) {
        int ans = 0;

        int power = 1;
        while(n>0) {
            int rem = n%b;
            n = n/b;

            ans = ans + rem*power;
            power = power * 10;
        }

        return ans;
    }
}
