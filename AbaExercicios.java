public class AbaExercicios{
    public static void main(String[] args) {
        int dia = 3;
        String nomeDoDia;

        switch (dia) {
            case 1:
                nomeDoDia = "Segunda Feira";
                break;
            case 2:
                nomeDoDia = "Terça Feira";
                break;
            case 3:
                nomeDoDia = "Quarta Feira";
                break;
            default:
                nomeDoDia = "Dia inválido";
                break;
        }
        System.out.println("O dia " + dia + " na semana é: " + nomeDoDia);
    }
}