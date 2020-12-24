#include<iostream>
using namespace std;
 int convertfive(int n){
    int temp=0;
    while(n>0){
        if(n%10==0){
            temp=temp*10+5;
        }
        else
        {
            temp=temp*10+n%10;
        }
        n=n/10;
    }
    n=0;
    while(temp>0){
        n=n*10+temp%10;
        temp=temp/10;
    }
    return n;
}
int main(){
    int n;
    cin>>n;
    cout<<convertfive(n);
	return 0;
}
