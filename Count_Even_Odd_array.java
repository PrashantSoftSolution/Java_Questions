public class Count_Even_Odd_array {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int arr[] = {23, 4, 54, 3};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even_No : " + even + "Odd_No : " + odd);
    }
    
}
