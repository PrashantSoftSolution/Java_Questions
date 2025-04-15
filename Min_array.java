
import java.util.Scanner;

public class Min_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int n= sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array num : ");

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int min=arr[0];

        for(int j=0; j<arr.length; j++){
           
            if(min>arr[j]){
              min=arr[j];
             
            }
        }
        System.out.print("Minimum element : " + min);
    }
    
}
