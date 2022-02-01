import java.util.Scanner;

public class suma{
   
   
    static void menu(){
        int a,b;  //Variables que usaremos para la suma
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        a = sc.nextInt();

        System.out.println("Dame un numero: ");
        b = sc.nextInt();

        result = a + b;//suma de las dos variables, que almacenamos en resultado

        System.out.println(result);

    }
    public static void main(String[] arg){

        menu();
    } 
}
