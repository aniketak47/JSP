package pattern10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = scn.nextInt();
        scn.close();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1){
                    if(j<=n/2+1 || j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else if(i<n/2+1){
                    if(j==n/2+1 || j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else if(i==n/2+1){
                    System.out.print("*\t");
                }else if(i<n){
                    if(j==n/2+1 || j==1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else{
                    if(j>=n/2+1 || j==1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
