import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1; i<=n; i++){
             count++;
        }
        if(count==2){
            System.out.println("Prime Number ");
        }
        else{
            System.out.println("Not Prime number ");
        }

    }
    
}
