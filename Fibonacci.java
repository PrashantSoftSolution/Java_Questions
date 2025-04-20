
import java.util.Scanner;

// 0 1 1 2 3 5 8 

public class Fibonacci {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
       int n= sc.nextInt();

       int  first=0;
       int sec =1;
      System.out.print(first);
      System.out.print(sec);

       for(int i=0; i<n; i++){
          int next=first + sec;
          first = sec;
          sec= next;
          System.out.print(next);
       }
    }
    
}
