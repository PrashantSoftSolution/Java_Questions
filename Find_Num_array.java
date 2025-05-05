public class Find_Num_array {
    public static void main(String[] args) {
        int arr[]= { 22, 4, 3, 222, 33};
        int n=33;

        for(int i=0; i<arr.length; i++){
            if(n==arr[i]){
                System.out.print(i);
            }
        }
    }
    
}
