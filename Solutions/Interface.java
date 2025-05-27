interface Playable{
    public void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Plays guitar");
    }

}
class Piano implements Playable{
    public void play(){
        System.out.println("plays piano");
    }

}
public class Interface {
    public static void main(String args[]){
        Guitar ob= new Guitar();
        ob.play();
        Piano ob1= new Piano();
        ob1.play();
    }
    
}
