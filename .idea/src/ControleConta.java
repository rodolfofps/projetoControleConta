import java.util.Scanner;

public class ControleConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Insira o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o tipo de conta (Corrente ou Poupança): ");
        String tipoConta = scanner.nextLine();

        System.out.println("Informe o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // limpa quebra de linha

        // Exibição dos dados
        System.out.println("==============================================================");
        System.out.println("                   DADOS CLIENTE                              ");
        System.out.println("\nNome cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("===============================================================");

        // Menu
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        int opcao = 0;

        while (opcao != 4) {
            System.out.println(menu);

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();


                switch (opcao) {
                    case 1:
                        System.out.println("O saldo atualizado é: R$ " + saldo);
                        break;
                    case 2:
                        System.out.println("Qual o valor a ser transferido?");
                        double valorParaTransferir = scanner.nextDouble();
                        scanner.nextLine();
                        if (valorParaTransferir > saldo) {
                            System.out.println("Saldo insuficiente para realizar transferência");
                        } else {
                            saldo -= valorParaTransferir;
                            System.out.println("Transferência realizada com sucesso. Novo saldo: R$ " + saldo);
                        }
                        break;
                    case 3:
                        System.out.println("Valor recebido: ");
                        double valorRecebido = scanner.nextDouble();
                        scanner.nextLine();
                        saldo += valorRecebido;
                        System.out.println("Valor adicionado com sucesso. Novo saldo: R$ " + saldo);
                        break;
                    case 4:
                        System.out.println("Encerrando o programa. Obrigado!");
                        break;
                    default:
                        System.out.println("Opção inválida. Digite um número entre 1 e 4.");
                        break;
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número entre 1 e 4.");
                scanner.nextLine(); // limpa a entrada inválida
            }
        }

        scanner.close();
    }
}
