 //take an Array of names an input form the users and print then on the screen
 

import java.util.*;
public class Arrays{
   /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];


        //input
        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }


        //output
        for(int i=0; i<names.length; i++){
            System.out.println("names " + (i+1) + "is : " + names[i]);
        }
    }*/

   //Maximum and minimum numbers in an Array of integers



         /*public static void main(String[] args) {
             Scanner sc = new Scanner(System.in );

             int size = sc.nextInt();
               int numbers[] = new int[size];

              for(int i=0; i<size; i++);{
                numbers[i] = sc.nextInt();
            }


                int max = Integer.MIN_VALUE;

                int min = Integer.MAX_VALUE;

         for(int i = 0; i< numbers.length; i++){
            if (numbers[i] <min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
         System.out.println("Largest number is : " + max );

         System.out.println("Smallest number is : " + min);
    } */ 


    //Take an array of numbers as input and check if it is array sorted in ascending order


    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int numbers[] = new int[size];

        for(int i = 0; i< size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i= 0; i<numbers.length-1; i++){  // NOTICE numbers.length - 1 as tremination condition

            if (numbers[i] > numbers[i+1]) {
                isAscending = false;
            }

        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");

        }else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
}