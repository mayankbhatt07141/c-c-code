package javapack2; // the file A.java is stored in the package javapack2.

public class A{
    public void f1(){
        System.out.println("this is in f1 of pack 2");
    }
}


//we hava another file B.java 


package javapack1;   // stored in javapack2 , if i run this code it compile sucessfully but class is not loading at run time .. IF I OMIT THE (PACkAGE JAVAPACk1) THEN THE CODE WORKS FINE.
import javapack2.A;
public class B {
    public static void main(String[] args) {
      A obj= new A();
        obj.f1();
    }
    
}
