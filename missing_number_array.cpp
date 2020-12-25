#include<iostream>
using namespace std;
#include <bits/stdc++.h>
int missingarray(int array[],int n){
	sort(array.begin,array.end);
    for(int i=1;i<n;i++){
        if(array[i-1]!=i){
            return i;
        }
    }
    // return 0;
// int sum=0;
// for(int i=0;i<n;i++){
//     sum=sum+array[i];
// }
// int totalsum=n*(n+1)/2;
// return (totalsum-sum);
}

int main(){
    cout<<"enter the number of elements in array";
    int n;
    cin>>n;
    int array[n];
    cout<<"enter the elements in array";
    int sum=0;
    for(int i=0;i<n-1;i++){
        cin>>array[i];
        // sum=sum+array[i];
    }
    cout<<missingarray(array , n);
    return 0;
}
