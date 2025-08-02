import java.util.Scanner;


public class day {
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);
        // Input numbers
         
         System.out.print("choice one number (1 to 7): ");
        int Name = Scanner.nextInt();
    

     switch(Name)  
         {
         case 1 :
            System.out.println("Monday");
            break;
         case 2 :
            System.out.println("Tuesday");
            break;
         case 3 :
            System.out.println("wednesday");
            break;
         case 4 :
            System.out.println("Thursday");
            break;
         case 5 :
            System.out.println("Friday");
            break;
         case 6 :
            System.out.println("saturday");
            break;
         case 7:
          System.out.println("Sunday");
          break;
          default:
        }
    }
 }