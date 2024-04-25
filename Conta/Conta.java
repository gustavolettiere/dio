package Conta;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaTerminal conta1 = new ContaTerminal();

        System.out.println("Digite o seu nome: ");
        conta1.nomeCliente = entrada.nextLine();

        System.out.println("Digite o número da sua conta: ");
        conta1.numero = entrada.nextInt();

        System.out.println("Digite sua agência: ");
        conta1.agencia = entrada.next();

        System.out.println("Saldo inicial: ");
        conta1.saldo = entrada.nextDouble();

        System.out.println("Olá " + conta1.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta1.agencia +
                ", conta " + conta1.numero + " e seu saldo é de: " + conta1.saldo);
    }
}
