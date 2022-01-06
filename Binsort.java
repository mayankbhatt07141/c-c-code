public class Binsort {
    public static void main(String args[]){
        int A[] ={0,1,1,0,1,0,0};
        int N=7,i=0;
        int j=N-1;
        while(i<j){
            if(A[i]==1&&A[j]==0){
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
                j--;
            }
            else if(A[i]!=1){
                i++;
            }
            else if(A[j]!=0){
                j--;
            }
        }
    }
}
