public class Missing_Number {
    public static void main(String[] args) {

        int sum=0;

        int arr[]= {1,2,4};
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        int  n=arr.length+1;

        int actual= n*(n+1)/2;

        int final_res=actual-sum;

        System.out.println("Missing Number : " + final_res);
    }
    
}
