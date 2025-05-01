public class Second_largest {
    public static void main(String[] args) {
        int arr[]= {2, 3, 5, 4, 80};
        int max=arr[0];
        int max_sec=arr[1];
        for(int i=0; i<arr.length; i++)
        {
            if(max<arr[i]){
                max_sec=max;
                max=arr[i];
            }

        }
        System.out.println("Second largest ele : " + max_sec);

    }
    
}
