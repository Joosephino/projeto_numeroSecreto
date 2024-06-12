import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        //Inicia com 0 e vai até onde for estabelecido
        while (nota != -1) {
            System.out.println("Digite sua nota sobre o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            //"+=" recebe o que já possuía, mais o que for atribuído
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        if (nota != -1) {
            System.out.println("Média de avaliações é " + mediaAvaliacao / totalDeNotas);
        }
    }
}
