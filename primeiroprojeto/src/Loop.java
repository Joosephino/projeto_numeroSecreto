import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        //Inicia com 0 e vai até onde for estabelecido
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua nota sobre o filme: ");
            nota = leitura.nextDouble();
            //"+=" recebe o que já possuía, mais o que for atribuído
            mediaAvaliacao += nota;
        }
        System.out.println("Média de avaliações é " + mediaAvaliacao/3);
    }
}
