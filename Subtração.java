import java .util.Scanner;
public class Subtração{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO: ");
        int a = sc.nextInt();
        System.out.println("DIGITE O SEGUNDO NUMERO:  ");
        int b = sc.nextInt();
        System.out.println("VOCÊ DIGITOU " + a + " E " + b );
        subtracao(a, b);
    }

        static void subtracao (int a, int b){
            if (a<b) {
                System.out.println("NAO DIVIDIREMOS POR INFERIORES MALDITO...");
            }    
            else{
            int resultado = a - b;
            System.out.println("O RESULTADO É .. " + resultado);
            }
        }
}