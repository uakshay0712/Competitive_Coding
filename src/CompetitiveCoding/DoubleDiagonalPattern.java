package CompetitiveCoding;

import java.util.Scanner;

public class DoubleDiagonalPattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i || j==n-1-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
