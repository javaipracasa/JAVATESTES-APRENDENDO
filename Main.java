public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Boo", 20);
        Pessoa pessoa2 = new Pessoa("Carlos", 25);

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);

        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
    }
}