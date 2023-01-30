package DSA.inverseOfNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = scn.nextInt();
        System.out.println("enter the array elements : ");

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        scn.close();

        int[] ans = new int[n];
        int val = n;
        for(int ele:arr){
            ans[n-ele] = val--;
        }

        // to print the array
        System.out.println(Arrays.toString(ans));        
    }
}
