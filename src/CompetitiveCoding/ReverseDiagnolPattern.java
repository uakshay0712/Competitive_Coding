package CompetitiveCoding;

import java.util.Scanner;

public class ReverseDiagnolPattern {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
