package pattern5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = scn.nextInt();
        scn.close();

        int space = n/2;
        int star = 1;

        for(int i=1;i<=n;i++){
            for(int csp=1;csp<=space;csp++){
                System.out.print("  ");
            }
            for(int cst=1;cst<=star;cst++){
                System.out.print("* ");
            }

            if(i<=n/2){
                star+=2;
                space--;
            }else{
                star-=2;
                space++;
            }

            System.out.println();
        }
    }
}
