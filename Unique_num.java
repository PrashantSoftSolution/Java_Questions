public class Unique_num {

    public static void main(String[] args) {
        int n[]={2,3,4,3,4};

        for(int i=0; i<n.length; i++){
            int count=0;


            for(int j=0; j<n.length; j++){
                if(n[i]==n[j]){
                    count++;
                }

            }
            if(count==1){
                System.out.println("Unique " + n[i]);
                break;

            }
        }
       
       
    }
    
}
