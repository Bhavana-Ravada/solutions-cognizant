import java.util.*;
class A implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hey");
        }
    }
}
class B extends Thread{
    public void run(){
         for(int i=0;i<100;i++){
            System.out.println("hello");
        }

    }
}
public class ThreadCreation {
    public static void main(String args[]){
        B ob= new B();
        ob.start();
        A ob1= new A();
        Thread ob2= new Thread(ob1);
        ob2.start();
    }

    
}
