import java.util.Scanner;

public class Deposito {
    private Conta conta;

    public Deposito(Conta conta) {
        this.conta = conta;
    }

    public void Depositar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        float quantia;

        while (continuar) {
            try {
                Apresentar();

                if (!scanner.hasNextFloat()) {
                    System.out.println("Entrada inválida! Por favor, insira um valor numérico.");
                    scanner.nextLine();
                    continue;
                }

                quantia = scanner.nextFloat();
                scanner.nextLine();

                if (quantia <= 0) {
                    System.out.println("Valor inválido, insira um valor maior que 0.");
                } else {
                    conta.Deposito(quantia);
                    System.out.println("Valor de R$ " + String.format("%.2f", quantia) + " depositado com sucesso.");
                    System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
                    continuar = false;
                }

            } catch (Exception e) {
                System.out.println("Erro inesperado. Por favor, tente novamente.");
                scanner.nextLine();
            }
        }
    }

    static void Apresentar() {
        System.out.println("\nConta Bancária");
        System.out.println("===================");
        System.out.print("Digite a quantia que deseja depositar: ");
    }
}
