import java.util.Scanner;

public class Marks {
    public static void main (Strings args[]){
        Scanner sc = new Scanner(System.in);
        int input;

        do{
            int marks = sc.nextInt();
            if (marks >=90 && marks <=100) {
                System.out.println("this is good");
            }else if (marks >=70 && marks <=89) {
                System.out.println("this is also goood ");
            }else if (marks >=0 && marks <=59) {
                System.out.println("this is good as well");
            }else {
                System.out.println("Invalid");
            }

            System.out.println("Want to continue ? (yes(1)  or no(0))");
            input = sc.nextInt();


        }while(input == 1);
    }
}
