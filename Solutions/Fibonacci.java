//import java.util.*;
public class Fibonacci {
    static int fib(int n){
        if(n<=1)
        return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        //int num=sc.nextInt();
        // int n1=0,n2=1,n3=0;
        // for(int i=2;i<num;i++){
        //     n3=n1+n2;
        //     n1=n2;
        //     n2=n3;   
        // }
        // System.out.println(n3);

        System.out.println(fib(5));
    }
    
}
