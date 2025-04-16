public class Armstrong_num {
    public static void main(String[] args) {
        
        int n=153;
        int original=n;
        int temp=original;

        int sum=0;
        int digitCount=0;

        while(temp!=0){
            digitCount++;
            temp/=10;
        }

        while(n!=0){
            int power=1;
            int digit=n%10;
            for(int i=0; i<digitCount; i++){
                power=power*digit;


            }
            sum=sum+power;
            n=n/10;
        }

        if(original==sum){
            System.out.println("It is Armstrong num");
        }
        else{
            System.out.println("It is not Armstrong num");
        }
    }
    
}
