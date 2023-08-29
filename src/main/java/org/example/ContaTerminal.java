package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // long, pois suporta inteiros maiores que o tipo int
        // e isso pode ser importante nesse caso
        long numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        System.out.println("Bem vinde ao banco!");
        System.out.println("Vamos criar sua conta.");

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta a ser criada: ");
        numero = scan.nextLong();
        // nextLong não consome a quebra de linha '\n'
        scan.nextLine();

        System.out.println("Por favor, digite o código da agencia dessa nova conta: ");
        agencia = scan.nextLine();

        System.out.println("Por favor, digite seu nome completo: ");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite seu saldo inicial dessa nova conta: ");
        saldo = scan.nextBigDecimal();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso" +
                " banco, sua agência é %s, conta %d e seu saldo %.2f " +
                "já está disponível para saque",
                nomeCliente.strip(), agencia.strip(), numero, saldo);
    }
}