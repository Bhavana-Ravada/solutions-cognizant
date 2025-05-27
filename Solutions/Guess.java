import java.util.*;
public class Guess {
    public static void main(String args[]){
       
        Scanner sc= new Scanner(System.in);
        int randnum= (int)(Math.random()*100)+1;
        int num= sc.nextInt();

        while(num!=randnum){
             randnum= (int)(Math.random()*100)+1;
             num= sc.nextInt();
             System.out.println("rand "+randnum+" "+"num "+num);
             
        }
        

    }
    
}
