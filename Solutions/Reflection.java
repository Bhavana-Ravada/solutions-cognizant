import java.lang.reflect.*;

public class Reflection {
    public void sayHello() {
        System.out.println("Hello via Reflection");
    }
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Reflection");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
        Method sayHello = clazz.getMethod("sayHello");
        sayHello.invoke(obj);
    }
}
