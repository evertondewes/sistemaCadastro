import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {

    private String nome;
    private int idade;

    public static Pessoa entradaDados() {

        Scanner s = new Scanner(System.in);
        Pessoa p = new Pessoa();
        System.out.println("Entre o nome");
        p.nome = s.nextLine();
        System.out.println("Entre com a idade");
        p.idade = s.nextInt();
        s.nextLine();
        return p;
    }

    public static void mostrarDados(ArrayList<Pessoa> listaPesssoas) {
        for (int i = 0; i < listaPesssoas.size(); i++) {
            Pessoa p = listaPesssoas.get(i);
            System.out.println("Nome: " + p.nome + " idade: " + p.idade);
        }
    }
}

