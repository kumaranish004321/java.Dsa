import java.util.*;

public class Strings {
    public static void main(String args[]){
        /*Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is : "+ name);

        //concatenation
        String firstName = "Anish";
        String lastName = "Kumar";
        String fullName =firstName +" " + lastName;
        System.out.println(fullName.length());


        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }*/


        //compare

        // String name1 = "anish";
        // String name2 = "kajal";

        //1 s1>s2 +ve value
        //2 s1==s2: 0
        //3 s1<s2: -ve value
        
        // if(name1.compareTo(name2)==0){

        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }
        // if(name1 == name2){

        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }

        ///subString
        
        String sentence ="My name is Anish";
        String name= sentence.substring(11, sentence.length());
        System.out.println(name);

    }
}
