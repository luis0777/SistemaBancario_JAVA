import java.util.Scanner;

public class LoginConta {
    public void LogadoConta(Conta conta){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int numeroContaRecebido, digitoContaRecebido;
        String senhaContaRecebida;

        while (continuar){
            try {
                System.out.println("\n\nConta Bancaria");
                System.out.println("===================");

                System.out.print("Entre com o número da conta: ");
                numeroContaRecebido = scanner.nextInt();
                System.out.print("Entre com o dígito da conta: ");
                digitoContaRecebido = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Entre com a senha da conta: ");
                senhaContaRecebida = scanner.nextLine();

                while (numeroContaRecebido != conta.getNumero() || digitoContaRecebido != conta.getDigito() || !senhaContaRecebida.equals(conta.getSenha())){
                    System.out.println("Informações inválidas, tente novamente....");
                    System.out.println("\n\nConta Bancaria");
                    System.out.println("===================");

                    System.out.print("Entre com o número da conta: ");
                    numeroContaRecebido = scanner.nextInt();
                    System.out.print("Entre com o dígito da conta: ");
                    digitoContaRecebido = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Entre com a senha da conta: ");
                    senhaContaRecebida = scanner.nextLine();
                }

                System.out.println("Login efetuado com sucesso, clique em qualquer tecla para continuar...");
                EscolhaDaOperacao escolhaDaOperacao = new EscolhaDaOperacao(conta);
                escolhaDaOperacao.TipoDeOperacao();
                continuar = false;


            }catch (NumberFormatException erro){
                System.out.println("Erro, insira os dados corretamente\n\n");
            }
        }
    }
}
