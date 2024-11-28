import java.util.Scanner;

public class EscolhaDaOperacao {
    private Conta conta;

    public EscolhaDaOperacao(Conta conta) {
        this.conta = conta;
    }

    public void TipoDeOperacao() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                Apresentar();

                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida! Por favor, insira um número.");
                    scanner.nextLine();  
                    continue;  
                }

                int tipoDeOperacao = scanner.nextInt();
                
                while (tipoDeOperacao < 1 || tipoDeOperacao > 4) {
                    System.out.println("Operação inválida, tente novamente...");
                    Apresentar();
                    tipoDeOperacao = scanner.nextInt();
                }
                
                switch (tipoDeOperacao) {
                    case 1:
                        DadosConta dadosConta = new DadosConta(conta);
                        dadosConta.Dados();
                        break;

                    case 2:
                        Deposito deposito = new Deposito(conta);
                        deposito.Depositar();
                        break;

                    case 3:
                        Saque saque = new Saque(conta);
                        saque.Sacar();
                        break;

                    case 4:
                        System.out.println("Obrigado por usar o sistema bancário!");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Operação desconhecida.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Erro, por favor insira os dados corretamente.");
                scanner.nextLine();
            }
        }
    }

    static void Apresentar() {
        System.out.println("\n\nConta Bancária");
        System.out.println("===================");
        System.out.println("1 - Dados da conta\n2 - Depósito\n3 - Saque\n4 - Sair");
        System.out.print("Qual tipo de operação deseja realizar: ");
    }
}
