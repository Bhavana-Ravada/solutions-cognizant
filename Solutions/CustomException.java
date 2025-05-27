import java.util.*;
class InvalidAgeException extends Exception{
     InvalidAgeException(String m){
        super(m);
    }
}
public class CustomException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        try{
            if(age<18){
                throw new InvalidAgeException("Invalid");
            }
            else System.out.println("Valid age");
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());

        }
    }
    
}
