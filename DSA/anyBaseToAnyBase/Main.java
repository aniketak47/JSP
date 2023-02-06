package DSA.anyBaseToAnyBase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = scn.nextInt();
        System.out.println("enter the source base value : ");
        int src = scn.nextInt();
        System.out.println("enter the destination base value : ");
        int des = scn.nextInt();
        scn.close();

        int ans = anyBaseToAnyBase(n, src, des);
        System.out.println("value is "+ ans);
        
    }

    public static int anyBaseToAnyBase(int n, int sourceBase, int destinationBase) {
        int decimal = anyBaseToDecimal(n, sourceBase);
        int ans = decimalToAnyBase(decimal, destinationBase);
        return ans;
    }

    public static int anyBaseToDecimal(int n, int b) {
        int ans = 0;

        int power = 1;
        while(n>0) {
            int rem = n%10;
            n = n/10;

            ans = ans + rem*power;
            power = power * b;
        }

        return ans;
    }
    
    public static int decimalToAnyBase(int n, int b) {
        int ans = 0;

        int power = 1;
        while(n>0){
            int rem = n%b;
            n = n/b;

            ans = ans + rem*power;
            power = power * 10;
        }

        return ans;
    }
}
