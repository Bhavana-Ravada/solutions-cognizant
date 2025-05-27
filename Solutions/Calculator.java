import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Enter the operation to be performed");
        String op=sc.next();
        switch(op){
            case "add":
            System.out.println(a+b);
            break;
            case "sub":
            System.out.println(a-b);
            break;
            case "mul":
            System.out.println(a*b);
            break;
            case "div":
            System.out.println(a/b);
            default:
            System.out.println("Please enter a valid operation");

        }
    }
    
}
