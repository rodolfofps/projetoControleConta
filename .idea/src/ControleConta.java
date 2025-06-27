import java.util.Scanner;

public class ControleConta {
    public static void main(String[] args) {
        // Inicializar dados cliente

        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nome = leitura.nextLine();
        System.out.println("Informe o tipo de conta (Correte ou Poupança): ");
        String tipoConta = leitura.nextLine();
        System.out.println("Informe o saldo: ");
        double saldo = leitura.nextDouble();

        int opcao = 0;
        //Exibição dados pro user

        System.out.println("==============================================================");
        System.out.println("                   DADOS CLIENTE                              ");
        System.out.println(" \nNome cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("===============================================================");

        //Criando menu de opções
        //Executar opções até user dar comando para parada
        String menu = """
                ** Digite sua opção**
                1 - Consultar saldo
                2 - Tranferir valor
                3 - Receber valor
                4 - Sair
                
                """;


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
               switch (opcao) {
                          case 1:
                              System.out.println("O saldo atualizado é: " + saldo);
                              break;
                          case 2:
                              System.out.println("Qual o valor a ser transferido?");
                              double valorParaTransfeir = leitura.nextDouble();

                              if (valorParaTransfeir > saldo) {
                                  System.out.println("Saldo insuficiente para realizar transferência");
                              } else {
                                  saldo -= valorParaTransfeir;
                                  System.out.println("Transferência realizada com sucesso. Novo saldo: R$ " + saldo);
                              }
                              break;
                          case 3:
                              System.out.println("Valor recebido: ");
                              leitura.nextLine();
                              double valorRecebido = leitura.nextDouble();
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
        }
    }
}
