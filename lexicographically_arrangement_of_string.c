#include<stdio.h>
#include<string.h>
int main(){
	char string[5][10];
	int i,r,j;
	char temp[10];
	printf("enter the names\n");
	for(i=0;i<5;i++){
		scanf("%s",string[i]);
	}
	for(i=0;i<4;i++){
		for(j=0;j<5-i-1;j++){
			r=strcmp(string[j],string[j+1]); //it will return 0 if both te strings are same
			//and returns less than 1 if string 1 is less than the string 2 and return grater 1 
			//if string 1 is grater than string 2
			if(r<=0){
				printf("in the if \n");
				strcpy(temp,string[j]);
				strcpy(string[j],string[j+1]);
				strcpy(string[j+1],temp);
			}
		}
		
	}
	for(i=0;i<5;i++){
		printf("%s\n",string[i]);
	}
}
