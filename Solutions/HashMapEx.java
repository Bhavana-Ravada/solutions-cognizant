import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<Integer,String> mp= new HashMap<>();
        mp.put(1,"keerthi");
        mp.put(2,"ramya");
        mp.put(3,"teju");
        mp.put(4,"varsha");
        mp.put(5,"karuna");
        System.out.println("enter any value from 1 to 5");
        int num= sc.nextInt();
        System.out.println(mp.get(num));

    }
    
}
