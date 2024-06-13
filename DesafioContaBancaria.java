import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        String nome = "Marco Tortelli";
        String tipoConta = "Corrente";
        double saldoDaConta = 1599.99;
        int opcao = 0;

        System.out.println("\n***********************");
        System.out.println("Cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo em caixa: " + saldoDaConta);
        System.out.println("***********************");
        
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
        }
    }
}
