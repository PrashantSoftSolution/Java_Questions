public class Sum_of_two_array {
    public static void main(String[] args) {
        int arr[] = {1, 3, 23, 2};
        int arr1[]= {2, 3, 4, 6};
        int sum[] = new int[4];

        for(int i=0; i<4; i++){
            sum[i]=arr[i]+arr1[i];

        }
        for(int i=0; i<4; i++){
        System.out.print(" " + sum[i] + " ");
        }
    }
    
}
