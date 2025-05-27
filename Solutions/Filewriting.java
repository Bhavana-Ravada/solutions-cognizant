import java.io.*;
import java.util.*;
public class Filewriting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            writer.write(text);
            writer.close();
            System.out.println("Successfully written");


        }
        catch(IOException e){
            System.out.println("Exception caught wjile writing");
            e.printStackTrace();
        }
    }
    
}
