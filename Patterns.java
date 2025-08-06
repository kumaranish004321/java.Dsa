import java.util.*;

public class Patterns {
    public static void main (Strings args[]){
        /*int n=5;
        int m= 4;
       for(int i=0; i<n; i ++){
        for(int j=0; j<m; j++){
            System.out.print("*");
        }
        //outer loop
        for(int i=0; i<n; i++){
            //inner loop
            for(int j=0; j<m; j++){
                //cell -> (i,j)
                if (i == 0 || i == n-1 || j == 0 || j== m-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            // Half pyramid

            int n = 4;
            //outer loop
            for(int i=1; i<=n; i++){
                //inner loop
                for(int j=1; j<=i; j++){
                   System.out.print("*");
            } 
           int n= 4;
           //outer loop
           for(int i= n; i<=1; i++){
            System.out.print("*");
            //inner loops
            for(int j= n; j<=1; j++){
                System.out.print(" ");
            
            }
            int n=4;
            for(int i=n; i>=1; i ++){
                for(int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                //inner loop -> Star print
                for(int j = 1; j<=n-i; j++){
                    System.out.print("*");
                
                }
                 System.out.println();
        } 

        //_________________________________________________________
        //_____________________________________________________________
        int n=5;
        int number=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;

            }
            System.out.println();
        }*/

        //________________________________________________________
        //___________________________________________________________
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if ((i+j) %2== 0) {
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
       }
    }
