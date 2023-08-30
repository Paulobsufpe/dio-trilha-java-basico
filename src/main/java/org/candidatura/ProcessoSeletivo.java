package org.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    private final static double salarioBase = 2000.0;
    private final static int maxTentativasDeContato = 3;

    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Márcia", "Júlia"};
        for (String cand : candidatos) {
            entrandoEmContato(cand);
        }
    }

    static void entrandoEmContato(String candidato) {
        boolean atendeu = false;
        for (int i = 1; i <= maxTentativasDeContato; i++) {
            if (atender()) {
                atendeu = true;
                System.out.println("CONTATO REALIZADO COM SUCESSO");
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato +
                        " NA " + i + "° TENTATIVA");
                break;
            }
        }
        if (!atendeu) {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +
                    ", NÚMERO MÁXIMO DE " + maxTentativasDeContato +
                    " TENTATIVAS REALIZADAS");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 0;
    }

    //    static void imprimirSelecionados() {}
    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Márcia", "Júlia"};

        for (String candidato : candidatos) {
            final double salarioPretendido = valorPretendido();
            System.out.println("O/A candidato/a " + candidato +
                    " solicitou o valor de salário de " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O/A cadidato/a " + candidato +
                        " foi selecionado/a para a vaga!");
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarSalario(double salarioPretendido) {
        final double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO OS RESULTADOS DOS DEMAIS CANDIDATOS");
        }
    }
}
