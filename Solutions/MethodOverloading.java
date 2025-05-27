public class MethodOverloading {
    static int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloading ob= new MethodOverloading();
        System.out.println(add(2,3));
        System.out.println(ob.add(45.7,2.1));
        System.out.println(ob.add(1,2,3));
        
    }
    
}
