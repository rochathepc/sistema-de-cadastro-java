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

        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Buscar por nome");
        System.out.println("4 - Sair");

        int opcao = menu.nextInt();
    }
}
