import java.util.*;
import java.util.stream.Collectors;
public class RecordsDemo {
    record Person(String name, int age){}
    public static void main(String[] args) {
        Person p1= new Person("Moksha", 10);
        Person p2= new Person("Malavika", 20);
        Person p3= new Person("Monisha", 24);
        Person p4= new Person("Mohitha", 19);
        List<Person> adults=List.of(p1,p2,p3,p4);
        List<Person> list= adults.stream().filter(person->person.age()>=18)
        .collect(Collectors.toList());
       // System.out.println(list);
       list.forEach(n->System.out.println(n));


    }
    
}
