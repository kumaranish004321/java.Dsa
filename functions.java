import java.util.*;


public class functions {
    /*public static void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int a = 10;
        int b =15;
        sum(a, b);
    }
*/

//_______________________________________________________________________
// Write a function to multiply 2 numbers
//______________________________________________________________________


//multiply 2 numbers
    /*  public static int multiply(int a, int b ){
        return a*b;
    }

        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();


        int result = multiply(a, b);

        System.out.println(result);
    }*/
          
    //---------------------------------------------------------
    //Waite a function to calculate the factorial of a number
    //_______________________________________________________

    /*public static void printFactorial(int n){
        //loop
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial * 1;
        }


        System.out.println(factorial);
        return;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }*/
    public static int calculateProduct(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        System.out.println(calculateProduct(a, b));
    }

}

