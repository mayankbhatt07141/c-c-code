#include<iostream>
#include<math.h>
using namespace std;
int find_no_of_digits(int n){
  return log10(n)+1;           // no_of_digits is equal to the log base 10 +1
}
int main(){
  int n;
  cin>>n;
  cout<<find_no_of_digits(n);
  
}
