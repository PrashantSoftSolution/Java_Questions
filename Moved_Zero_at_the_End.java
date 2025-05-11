public class Moved_Zero_at_the_End {
    public static void main(String[] args) {
        int arr[]= {1,0,4,0,5};
        //int arr1[]=new int[5];
        int pos=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp= arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;

                pos++;

            }

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
