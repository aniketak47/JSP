package DSA.primeFactorisation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = scn.nextInt();
        scn.close();

        System.out.println("Prime Factorisation of "+ n + " is :");
        for(int div=2;div*div<=n;div++){
            while(n%div == 0){
                System.out.print(div+" ");
                n = n/div;
            }
        }

        if(n>1){
            System.out.print(n);
        }
    }
}
