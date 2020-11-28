#include<stdio.h>
void rotateArr(int arr[],int d,int n);
int main(){
	int arr[5]={1,2,3,4,5};
	rotateArr(arr ,2,5);
	
}
void rotateArr(int arr[], int d, int n){
   	int j=d-1;
   	int i,temp;
	for(i=0;i<j;i++,j--){
        temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
	}
     
	j=n-1;
    for(i=d;i<j;i++,j--){
    	 temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
	}
     j= n-1;
    for( i=0;i<j;i++,j--){
     	temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
	}
    for(i=0;i<n;i++){
    	printf("%d",arr[i]);
	}
}
