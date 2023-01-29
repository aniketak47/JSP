import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the value of n :");
        int n = scn.nextInt();
        scn.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}