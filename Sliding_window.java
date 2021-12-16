// find max of given window size
public class Sliding_window {
     public static void main(String[] args) {
        int arr[]={5,1,4,2,3,7,8,9,10};
        int k=3;  
        int sum=0;
        for(int i=0;i<9;i++){
            int localsum=0;
            for(int j=i;j<i+k;j++){
                localsum=localsum+arr[j];
            }
            System.out.println(localsum);
            sum=sum+localsum;
        }  
        System.out.println(sum);
    }
    

}
