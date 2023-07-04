import java.util.Scanner;

public class question_1{


    public static int sum(int N){

        //base case

       if(N<10){return N;}



        int last_digit=N%10;
        int ans=last_digit + sum((N/10));
        return ans;




    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        System.out.println(sum(N));



        }

        
}
