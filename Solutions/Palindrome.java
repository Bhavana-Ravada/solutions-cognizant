import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String rev= new StringBuilder(s).reverse().toString();
        if(s.equals(rev))
        System.out.println("palindrome");
        else System.out.println("Not a palindrome");
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if((c>='0' && c<='9')||(c>='A'&& c<='Z')||c>='a'&& c<='z'){
                res.append(c);
            }
        }
        String result=res.toString();
        System.out.println( result.toLowerCase());
        
    }
    
}
