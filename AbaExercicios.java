import java.util.Random;
import java.util.Scanner;

public class AbaExercicios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroInserido = 0;
        int tentativas = 0;

        while (tentativas < 5){
            System.out.println("Digite um número:");
            numeroInserido = leitura.nextInt();
            tentativas++;

            if (numeroInserido == numeroAleatorio){
                System.out.println("Parabéns! Você acertou o número secreto");
                break;
            } else if (numeroInserido < numeroAleatorio){
                System.out.println("O número informado é menor que o número gerado");
            } else{
                System.out.println("O número informado é maior que o número gerado");
            }
            if (tentativas == 5 && numeroInserido != numeroAleatorio) {
                System.out.println("Tentativas esgotadas :(, o número gerado era: " + numeroAleatorio);
            }
        }
    }
}