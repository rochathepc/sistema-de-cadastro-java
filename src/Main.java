import java.util.Scanner;

class Cliente {
    //**ATRIBUTOS**
    private int id;
    private String nome;
    private String email;
}

public class Main {
    public static void main(String[] args){
        Scanner menu = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar por nome");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma das opções: ");

            opcao = menu.nextInt();
            menu.nextLine(); //bug do buffer parado

            if (opcao == 1) {
                System.out.println("-----SISTEMA DE CADASTRO INICIADO-----");
                System.out.println("1. Digite o Nome: ");
                String nome = menu.nextLine();

                System.out.println("2. Agora digite o E-mail: ");
                String email = menu.nextLine();
            }
        }
    }
}
