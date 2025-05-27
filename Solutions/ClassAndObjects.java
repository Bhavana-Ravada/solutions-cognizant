class Car{
    int year,make;
    String model;
    Car(){
        this.make=30;
        this.model="Ertiga";
        this.year=2024;
    }
    void displayDetails(){
        System.out.println("Car details:");
        System.out.println("Manufactured year"+" "+year+" Model"+" "+model+"Making days"+" "+make);
    }
}
    public class ClassAndObjects {
        public static void main(String[] args) {
            Car ob= new Car();
            ob.displayDetails();
        }

    
}
