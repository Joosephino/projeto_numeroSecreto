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
        
            if (opcao == 1){
                System.out.println("O saldo é: " + saldoDaConta);
            } else if (opcao == 2){
                System.out.println("Digite o valor a ser transferido: ");
                double valor = leitura.nextInt();
                if (valor > saldoDaConta) {
                    System.out.println("Não há saldo suficiente para transferência!");
                } else {
                    saldoDaConta -= valor;
                    System.out.println("Novo saldo: " + saldoDaConta);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldoDaConta += valor;
                System.out.println("Novo saldo: " + saldoDaConta);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }        
        }
    }
}
