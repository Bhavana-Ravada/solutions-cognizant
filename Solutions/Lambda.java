import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        List<String> l= new ArrayList<>();
        l.add("kamakshi");
        l.add("renuka");
        l.add("deva");
        l.add("bhavana");
        l.add("malavika");
        Collections.sort(l,(s1,s2)->s2.compareTo(s1)); //dec order
       // l.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(l);
        
    }
    
}
