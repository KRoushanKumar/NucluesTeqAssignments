import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int arrSize=10;
        int arr[]={2,6,5,9,4,6,8,6,9,5};
        int secHig=0;
        Arrays.sort(arr);
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");

            
        }
        
        for(int i=arrSize-2;i>=0;i--)
        {
            if(arr[i]!=arr[arrSize-1]){
                secHig=arr[i];
                break;
            }
        }

        System.out.println("\nSecond highest is "+secHig);
    }
}
