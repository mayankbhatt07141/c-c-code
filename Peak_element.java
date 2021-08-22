public class Peak_element{
    public static void main(String args[]){
        int n=7;
        int arr[]={5,20,40,30,20,50,60};
        System.out.println(peak(arr,n));
    }
    public static  int peak(int arr[],int n){
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            while(l<=r){
                if((mid==0||arr[mid]>=arr[mid-1])&&(mid==n-1)||arr[mid]>=arr[mid+1]){
                    return 1;
                }
                else if(mid>0&&arr[mid]<arr[mid-1]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return 0;
    }
}