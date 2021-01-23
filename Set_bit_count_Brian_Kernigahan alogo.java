/* According to brain Kernigahan -Subtracting 1 from a decimal number flips all the bits after the rightmost set bit(which is 1) including the rightmost set bit.
example-
10 in binary is 00001010  
9 in binary is 00001001 turned all bits 1 from rightmost set bit (turned 0)*/

public class SetbitCount{
  public sattic void main(String agrs[]){
      int n=10;
      int result=0;
      while(n>0){
          n=n&(n-1);
          result++;
      }
      System.out.println("set bits are"+result);
  }   
}

