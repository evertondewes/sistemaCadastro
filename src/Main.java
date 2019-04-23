import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        ArrayList<Pessoa> listaPesssoas = new ArrayList<Pessoa>();
        ArrayList<Telefone> listaTelefone = new ArrayList<Telefone>();

        do {
            System.out.println("Entre com a opcao:");
            System.out.println("1) cadastro pesssoa");
            System.out.println("2) listagem pessoa");
            System.out.println(".......");
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
                    Pessoa p = Pessoa.entradaDados();
                    listaPesssoas.add(p);
                    break;
                case 2:
                    Pessoa.mostrarDados(listaPesssoas);
                    break;
            }

        } while (opcao != 0);

        System.out.println("Adeus!");
    }
}
