import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        //Irá gravar o que for escrito no terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idadeUsuario = scanner.nextInt();
        System.out.println("Digite seu valor na conta: ");
        double contaUsuario = scanner.nextDouble();

        System.out.println("O usuário se chama " + nomeUsuario + ", possui " + idadeUsuario + " anos e tem R$ " + contaUsuario + " na conta bancária!");

    }
}
