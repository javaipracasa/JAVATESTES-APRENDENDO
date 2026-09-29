public class Main {

    public static void main (String[] args){
        
        int resultado = dividir(8,0);
        System.out.println(resultado);

    }
    
    static int dividir(int a, int b){ 
        if(b == 0){
            System.out.println("dividir entre zero...jamais");
            return 0;
            }
        return a/b;
        }
    }