package pattern6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = scn.nextInt();
        scn.close();

        int star = n/2+1;
        int space = 1;

        for(int i=1;i<=n;i++){
            for(int cst=1;cst<=star;cst++){
                System.out.print("* ");
            }

            for(int csp=1;csp<=space;csp++){
                System.out.print("  ");
            }

            for(int cst=1;cst<=star;cst++){
                System.out.print("* ");
            }

            if(i<=n/2){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }

            System.out.println();
        }
    }
}
