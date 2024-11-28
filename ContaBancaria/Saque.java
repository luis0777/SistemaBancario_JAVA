import java.util.Scanner;

public class Saque {
    private Conta conta;
    public Saque(Conta conta){
        this.conta = conta;
    }

    public void Sacar(){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        float quantia;
        char resposta;

        while (continuar){
            try {
                Apresentar();

                if (!scanner.hasNextFloat()) {
                    System.out.println("Entrada inválida! Por favor, insira um valor numérico.");
                    scanner.nextLine();
                    continue;
                }

                quantia = scanner.nextFloat();
                scanner.nextLine();

                if (conta.getSaldo() > quantia) {
                    conta.Saque(quantia);
                    System.out.println("Saque de R$ " + String.format("%.2f", quantia) + " realizado com sucesso!");
                    System.out.println("Saldo atual R$ " + String.format("%.2f", conta.getSaldo()));
                }else{
                    System.out.println("Saldo insuficiente para realizar o saque.");
                    System.out.println("Deseja efetuar o saque e ficar com o saldo negativo? (s/n)");
                    resposta =  scanner.nextLine().charAt(0);

                    if(resposta == 's'){
                        conta.Saque(quantia);
                        System.out.println("Saque de R$ " + String.format("%.2f", quantia) + " realizado com sucesso!");
                        System.out.println("Saldo atual R$ " + String.format("%.2f", conta.getSaldo()));

                    }else {
                        System.out.println("Saque cancelado");
                    }
                }
                continuar = false;


            } catch (Exception e) {
                System.out.println("Erro inesperado. Por favor, tente novamente.");
                scanner.nextLine();
            }
        }
    }
    static void Apresentar() {
        System.out.println("\nConta Bancária");
        System.out.println("===================");
        System.out.println("Taxa de R$ 5,00 por saque");
        System.out.print("Digite a quantia que deseja sacar: ");
    }
}
