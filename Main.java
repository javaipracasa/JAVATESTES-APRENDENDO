import java .util.Scanner;
public class Main {
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero:  ");
    int num = sc.nextInt();
    System.out.println("O numero digitado foi: " + num);
    System.out.println("Digite outro numero:  ");
    int num2 = sc.nextInt();
    System.out.println ("O segundo numero digitado foi: " + num2);
    int resultado = somar(num, num2);
    System.out.println("o resultado da soma é:  " + resultado);
    }

    static int somar(int num, int num2){
        return num + num2;
    }

}