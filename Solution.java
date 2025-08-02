//_______________________________________________________________
//Enter 3 Number from the user and make a function print their average
import java.util.*;
public class Solution{
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
       

        int average = (a+b+c) /3;
        System.out.println(average);
    }*/

    //_______________________________________________________________________
    //Write a function to print the sum of all odd numbers from 1 to n.


    /*public static void printSum(int n){
        int sum =0;

        for(int i=1; i<=n; i++){
            if (i % 2 !=0) {  // condition for evan if(i % 2==0)
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       printSum(n);   
    }*/

    //_________________________________________________________________
    //Write a function which takes in 2 numbers and return the greater of those two


    /*public static int getGreater(int a, int b){
        if (a >b) {
            return a;

        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        System.out.println(getGreater(a, b));
    }*/

    //_____________________________________________________
    //A person is eligable to vote or not . A person of age >18 is eligable to vote


    /*public static boolean isEligable(int age){
        if (age>18) {
            System.out.println("you are eligable for vote");
            return true;
        }else{
            System.out.println("You are not eligable for vote");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isEligable(age));
    }*/

    //_____________________________________________________________
   // Write a program to enter the numbers till the use wants and at the end it sould display  the count of positive, negative and zeros entered


   /*public static void main(String[] args) {
    int positive = 0, negative = 0, zeros = 0;
    System.out.println("press 1 to continue & 0 to stop");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    while(input == 1) {
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        if (number>0) {
            positive++;

        }else if (number <0) {
            negative++;
        }else{
            zeros++;
        }
        System.out.println("Press 1 to continue & 0 to stop");
       input = sc.nextInt();
    }
    System.out.println("Positive : " +positive);
    System.out.println("Negative :" +negative);
    System.out.println("Zeros :" +zeros);
   }*/

   //_______________________________________________________________
   //calculate the Greatest Common Divisor of 2numbers.
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
      while (n1 != n2 ) {
        if (n1>n2) {
            n1 = n1 - n2;
        }else{
            n2 = n2 - n1; 
        }
      }
      System.out.println("GCD is : "+n2);
   }
}