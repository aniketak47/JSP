package pattern9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = scn.nextInt();
        scn.close();

        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==col || row+col==n+1){
                    System.out.print("*	");
                }else{
                    System.out.print("	");
                }
            }
            System.out.println();
        }
    }
}
