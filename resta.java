import java.util.Scanner;

public class resta{
   
   
    static void menu(){
        int a,b; 
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        a = sc.nextInt();

        System.out.println("Dame un numero: ");
        b = sc.nextInt();

        result = a - b;

        System.out.println(result);

    }
    public static void main(String[] arg){

        menu();
    } 
}