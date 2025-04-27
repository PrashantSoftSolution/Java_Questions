public class Copy_array_another_array {
    public static void main(String[] args) {
        int arr[]= {1, 3, 4, 5};
        int arr1[] = new int [4];

        for(int i=0; i<4; i++){
            arr1[i] = arr[i];
            System.out.print(arr1[i]);

        }
    }
    
}
