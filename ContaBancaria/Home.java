import java.util.Scanner;

public class Home {
    private  Conta conta;

    public void Inicio() {
        Scanner scanner = new Scanner(System.in);
        int tipoDeOperacao;
        boolean continuar = true;

        while (continuar) {
            try {
                Apresentacao();
                tipoDeOperacao = Integer.parseInt(scanner.nextLine());

                while (tipoDeOperacao < 1 || tipoDeOperacao > 3) {
                    System.out.printf("Escolha invalida, tente novamente....\n\n");
                    Apresentacao();
                    tipoDeOperacao = Integer.parseInt(scanner.nextLine());
                }

                switch (tipoDeOperacao) {
                    case 1:
                        CriarConta criarConta = new CriarConta();
                        conta = criarConta.criandoConta();
                        break;
                    case 2:
                        if(conta != null){
                            LoginConta loginConta = new LoginConta();
                            loginConta.LogadoConta(conta);
                        }else{
                            System.out.println("Crie sua conta primeiro");
                        }
                        break;
                    case 3:
                        System.out.println("Encerrando programa....");
                        continuar = false;
                        break;
                }
            } catch (NumberFormatException erro) {
                System.out.println("Erro, insira a opção que deseja corretamente\n\n");
            }
        }
    }

    static void Apresentacao(){
        System.out.println("\n\nConta Bancaria");
        System.out.println("==================");
        System.out.println("1 - Criar conta\n2 - Entrar na conta\n3 - Sair");
        System.out.print("Escolha qual operação deseja realizar: ");
    }
}
