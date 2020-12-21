
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main() {
	int n;
	cout<<"enter the size of array ";
	cin>>n;
	int j=n-1;
	int arr[n];
	cout<<"enter the elments in array";
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	for(int i=0;i<n/2;i++)	{
		swap(arr[i],arr[j]);
		j--;		
	}
	for(int i=0;i<n;i++){
		cout<<arr[i];
	}
}
