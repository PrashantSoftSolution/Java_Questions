public class Count_fequency_ele {
    public static void main(String[] args) {
        int count =0;
        int arr[]= {2,3,4,2,3};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }  
            System.out.println(arr[i] + " Feq.. " + count);     
        }
    
    }
}