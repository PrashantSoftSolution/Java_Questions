public class Sum_of_array_ele {
    public static void main(String[] args) {
        int arr[]={2, 5, 4, 3, 25};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array ele : " + sum);
    }
    
}
