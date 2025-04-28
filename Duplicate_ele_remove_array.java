public class Duplicate_ele_remove_array {
    public static void main(String[] args) {
        int arr[]= {1, 4, 5, 6, 2, 2};
        int arr1[]= new int [6];
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
            if(arr[i]!=arr[j+1]){
              arr1[i]=arr[i];


            }
        }
            System.out.print(arr1[i]);
        }
    }
    
}
