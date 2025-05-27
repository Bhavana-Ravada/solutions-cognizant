import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> a= new ArrayList<>();
        a.add("Bhavana");
        for(int i=0;i<3;i++){
            a.add(sc.nextLine());
        }
        System.out.println(a);
       // System.out.println(a.get(2));
    }
    
}
