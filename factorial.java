import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=input.nextInt();
        int result=factorial(n);
        System.out.println("The factorial is " + result);



    }
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    
}
