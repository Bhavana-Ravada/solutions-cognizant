import java.util.*;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num%400==0||num%4==0 && num%100!=0){
            
                System.out.println("Leap Year");
                return;

        }
        System.out.println("Not a Leap Year");
    }
    
}
