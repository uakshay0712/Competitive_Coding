package CompetitiveCoding;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=2*n-1;j++){
                if(j<=i || j>2*n-1-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=2*n-1;j++){
                if(j<=i || j>2*n-i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
