import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class CriarConta {
    public Conta criandoConta(){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        String titular, senhaConta = "", regex;
        int numeroConta, digitoConta;

        System.out.println("\n\nConta Bancaria");
        System.out.println("===================");

        System.out.print("Entre com o nome do titular: ");
        titular = scanner.nextLine();
        while(titular.isEmpty()){
            System.out.println("Nome invalido, tente novamente....");
            System.out.println("Conta Bancaria");
            System.out.println("===================");

            System.out.print("Entre com o nome do titular: ");
            titular = scanner.nextLine();
        }

        Random random = new Random();
        numeroConta = random.nextInt(90001) + 10000;
        System.out.println("O numero da conta é: " + numeroConta);

        digitoConta = random.nextInt(10);
        System.out.println("O digito da conta é: " + digitoConta);


        regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])[^\\s]{6}$";

        while (continuar) {
            System.out.print("Crie uma senha de 6 caracteres: ");
            senhaConta = scanner.nextLine().trim(); 

            if (senhaConta.matches(regex)) { 
                continuar = false; 
            } else {
                System.out.println("Senha inválida! A senha deve ter:");
                System.out.println("- Exatamente 6 caracteres;");
                System.out.println("- Pelo menos 1 letra maiúscula;");
                System.out.println("- Pelo menos 1 letra minúscula;");
                System.out.println("- Pelo menos 1 número;");
                System.out.println("- Pelo menos 1 caractere especial (@#$%^&+=!);");
                System.out.println("- Nenhum espaço permitido.");
            }
        }



        System.out.println("CONTA CRIADA COM SUCESSO!!!");
        System.out.print("Clique em qualquer tecla para continuar...");

        return new Conta ( numeroConta, digitoConta, senhaConta, titular);


    }
}
