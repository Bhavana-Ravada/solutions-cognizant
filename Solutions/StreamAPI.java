import java.util.*;
import java.util.stream.Collectors;
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(23);
        l.add(38);
        l.add(46);
        l.add(9);
      //  l.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
      List<Integer> list= l.stream().filter(n-> n%2==0).collect(Collectors.toList());
      System.out.println(list);


    }
    
}
