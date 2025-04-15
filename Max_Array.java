
import java.util.Scanner;

public class Max_Array {
    public static void main(String[] args) {

        // 1,2,3,4,3,2,3,1,4,5

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num : ");
        int n= sc.nextInt();
        int arr[] = new int [n];
        int max=arr[0];

        System.out.println("Enter the array number : ");
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();

        }
        for(int j=0; j<arr.length; j++){
            if(max<arr[j]){
                max=arr[j];
            }

        }
        System.out.print("highest num : " + max);

        
    }
    
}
