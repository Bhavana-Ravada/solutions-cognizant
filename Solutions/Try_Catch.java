import java.util.*;
public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        try{
            int res=a/b;
            System.out.println(res);

        }
        catch(ArithmeticException e){
            System.out.println("Meassage"+e);
        }
    }
    
}
