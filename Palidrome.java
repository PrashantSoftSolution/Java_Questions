
import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int rem_num=0;
        int rem;
        int old_value=n;
        while(n!=0){
            rem=n%10;
            rem_num=rem_num*10+rem;
            n=n/10;
        }
        if(old_value==rem_num){
            System.out.println("It is palindrom");
        }
        else{
            System.out.println("It is not palindrom");
        }

    }
    
}
