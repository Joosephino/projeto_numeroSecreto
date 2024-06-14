public class TesteSwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = 3;
        String nomeDoDia = "Inválido";

        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Segunda feira";
                break;
            case 2:
                nomeDoDia = "Terça feira";
                break;
            case 3:
                nomeDoDia = "Quarta feira";
                break; 
        }
        System.out.println("O dia " + diaDaSemana + " na semana é " + nomeDoDia);
    }
}