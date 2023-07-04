import java.util.Scanner;

public class question_3{

    public static String reverse(String string){

        //base case

        if(string.length()==0){
            return string;
        }
        char last_char=string.charAt(string.length()-1);

        String remaining_string=string.substring(0, string.length()-1);

        return last_char+reverse(remaining_string);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        System.out.println("Enter the string");
        String string=sc.nextLine();


        System.out.print("the reversed string is--->"+" "+ reverse(string));
    }



}










