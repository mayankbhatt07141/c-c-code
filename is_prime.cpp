#include<iostream>
#include<cmath>
using namespace std;
bool is_prime(int n){
	for(int i=2;i<sqrt(n)+1;i++){
		if(n%i==0)
			return false;
		else
			return true;	
	}
}
int main(){
	int n;
	cout <<"enter the number";
	cin >> n;
	cout << is_prime(n); //prints 1 if true (prime) and 0 if false(not prime)
	
}
