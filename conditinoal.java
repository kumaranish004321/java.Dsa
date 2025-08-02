import java.util.Scanner;
public class conditinoal {
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);
        int age = Scanner.nextInt();

        if(age > 18){
            System.out.println("Adult");

        }else{
            System.out.println("Not adult");
        }
    
    }
}
