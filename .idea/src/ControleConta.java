import java.util.Scanner;

public class ControleConta {
    public static void main(String[] args) {
        // Inicializar dados cliente

        Scanner dados = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nome = dados.nextLine();
        System.out.println("Informe o tipo de conta (Correte ou Poupança): ");
        String tipoConta = dados.nextLine();
        System.out.println("Informe o saldo: ");
        double saldo = dados.nextDouble();

    //Exibição dados pro user

        System.out.println("==============================================================");
        System.out.println("                   DADOS CLIENTE                              ");
        System.out.println(" \nNome cliente: " + nome                                      );
        System.out.println("Tipo de Conta: " + tipoConta                                  );
        System.out.println("Saldo atual: R$ " + saldo                                           );
        System.out.println("===============================================================");





    }

}
