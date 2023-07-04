import java.util.Scanner;


public class question_2 {

    public static int factorial(int N){
        //base case

        if(N==0){return 1;}



        int ans=N*factorial(N-1);
        return ans;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int N=sc.nextInt();

        System.out.println("The factorial of"+" "+N+" "+"is"+" "+factorial(N));
    }
    
}
