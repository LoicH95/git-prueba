import java.util.Scanner;

public class resta{
   
   
    static void menu(){
        int a,b; //Variables que usaremos para la resta
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        a = sc.nextInt();

        System.out.println("Dame un numero: ");
        b = sc.nextInt();

        result = a - b; //resta de las dos variables, que almacenamos en resultado

        System.out.println(result);

    }
    public static void main(String[] arg){

        menu();
    } 
}