//Currency program
import java.util.Scanner;
public class Currency {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter in inr:");
        float inr=input.nextFloat();
        float USD=(inr/95.14f);
        System.out.println(USD);
        
    }
    
}
