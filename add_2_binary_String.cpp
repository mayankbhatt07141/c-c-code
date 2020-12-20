
#include <iostream>
#include <bits/stdc++.h>
using namespace std;


void sum(string a, string b){
	reverse(a.begin(),a.end());
	reverse(b.begin(),b.end());
	string c="";
	int carry=0,sum=0;
	int i=0;
	int j=0;
	while(i<a.size()||j<b.size()){
		int x1=(a[i]-'0');
		int x2=(b[i]-'0');
		sum =x1+x2+carry;
		carry=sum/2;
		sum=sum%2;
		char ch=(sum+'0');
		c=c+ch;
		i++;
		j++;
	}
	if(carry){
		char ch=(carry+'0');
		c=c+ch;
	}
	reverse(c.begin(),c.end());
	cout<<c;
}
int main() {
	
	string a;
	string b;
	cin>>a;
	cin>>b;
	sum(a,b);
}
