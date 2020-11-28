#include<iostream>
#include<math.h>
using namespace std;
bool is_prime(int n){
	for(int i=2;i<=sqrt(n)+1;i++){
		if(n%i==0){
			return false;
		}
	}
	return true; 
		
}
int multi(int n){
	int multi=1;
	while(n>0){
		multi*=n%10;
		n=n/10;
	}
	return multi;
}
int smalltest(int n){
	int number=n;
	while(number++)		
		if(multi(number)==n){
			return number;
		}
	}

int main(){
	int n;
	cout<<"enter the number";
	cin>>n;
	if(floor(log10(n)+1)==1)
		cout<<n;
	else{
		if(is_prime(n)==0)
			cout<<smalltest(n);
		else
			cout<<"not possible";
} 
}
