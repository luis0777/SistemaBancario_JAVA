import java.util.Scanner;

public class DadosConta {
    private Conta conta;

    public DadosConta(Conta conta) {
        this.conta = conta;
    }

    public void Dados() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar  = true, senhaValida = true;
        char resposta;
        String nomeAlterado, senhaAlterada, regex;

        while (continuar) {
            try {
                System.out.println("\nConta Bancária");
                System.out.println("===================");
                System.out.println(conta);

                System.out.print("\nDeseja editar seus dados? (s/n): ");
                resposta = scanner.nextLine().charAt(0);

                if (resposta == 's' || resposta == 'S') {
                    System.out.println("Titular atual: " + conta.getTitular());
                    System.out.print("Deseja editar seu nome? (s/n): ");
                    resposta = scanner.nextLine().charAt(0);

                    if (resposta == 's' || resposta == 'S') {
                        System.out.print("Digite seu nome: ");
                        nomeAlterado = scanner.nextLine();
                        conta.setTitular(nomeAlterado);
                        System.out.println("Alteração concluída!");
                    }

                    System.out.println("\nSenha atual: " + conta.getSenha());
                    System.out.print("Deseja alterar sua senha? (s/n): ");
                    resposta = scanner.nextLine().charAt(0);

                    if (resposta == 's' || resposta == 'S') {
                        regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])[^\\s]{6}$";


                        senhaValida = false;
                        while (!senhaValida) {
                            System.out.print("Digite sua nova senha: ");
                            senhaAlterada = scanner.nextLine().trim();

                            if (senhaAlterada.matches(regex)) {
                                conta.setSenha(senhaAlterada);
                                System.out.println("Alteração concluída!");
                                senhaValida = true;
                            } else {
                                System.out.println("\nSenha inválida! A senha deve ter:");
                                System.out.println("- Exatamente 6 caracteres;");
                                System.out.println("- Pelo menos 1 letra maiúscula;");
                                System.out.println("- Pelo menos 1 letra minúscula;");
                                System.out.println("- Pelo menos 1 número;");
                                System.out.println("- Pelo menos 1 caractere especial (@#$%^&+=!);");
                                System.out.println("- Nenhum espaço permitido.");
                            }
                        }
                    }
                } else {
                    continuar = false;
                }
            } catch (Exception e) {
                System.out.println("Erro inesperado. Por favor, tente novamente.");
                scanner.nextLine();
            }
        }
    }
}
