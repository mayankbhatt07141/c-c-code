public class ThridLrgeElem {
    public static void main(String args[]){
            int array[]={1,5,2,3,4,7,8,9,6,10};
            int first=0;
            int second=0;
            int third=0;
            int n=10;
            for(int i=0;i<n;i++){
                if(array[i]>first){
                    third=second;
                    second=first;
                    first=array[i];

                }
                else if(array[i]>second){
                    third=second;
                    second=array[i];
                }
                else if(array[i]>third){
                    third=array[i];
                }
            }
            System.out.println(third);
    }
}
