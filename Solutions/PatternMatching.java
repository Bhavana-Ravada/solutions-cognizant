public class PatternMatching {
    public static void checkType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            case null -> System.out.println("It's null.");
            default -> System.out.println("Unknown type: " + obj);
        }
    }
    public static void main(String[] args) {
        checkType("Bhavana");
        checkType(15);
        checkType(null);
    }
    
}
