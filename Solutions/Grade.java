import java.util.*;
public class Grade {
    public static void main(String args[]){
        System.out.println("Enter marks:");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        char grade;
        if(num>=90 && num<=100) grade='A';
        else if(num>=80 && num<=89) grade='B';
        else if(num>=70 && num<=79) grade='C';
        else if(num>=60 && num<=69) grade='D';
        else grade='F';
        System.out.println(grade);
    }
    
}
