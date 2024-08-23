package org.example;
import java.util.Scanner;


public class Atv5Ex7 {
        private static int votosJoao = 0;
        private static int votosMaria = 0;
        private static int votosMarcos = 0;
        private static int votosBranco = 0;
        private static int votosNulo = 0;
        private static int totalVotos = 0;

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            while (true) {
                montarTela();
                System.out.print("Voto: ");
                int voto = ler.nextInt();

                if (voto == 6) {
                    break;
                }

                computarVoto(voto);
                limparTela();
            }

            apurarEleicao();
            ler.close();
        }

        private static void montarTela() {
            System.out.println  ("\n-----------------------------------------------");
        System.out.println("| E L E I Ç Ã O ? sistema de votação         |");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Votar em João");
        System.out.println("2. Votar em Maria");
        System.out.println("3. Votar em Marcos");
        System.out.println("4. Votar em branco");
        System.out.println("5. Anular o voto");
        System.out.println("6. Finalizar a votação");
}

private static void computarVoto(int voto) {
    switch (voto) {
        case 1:
            votosJoao++;
            break;
        case 2:
            votosMaria++;
            break;
        case 3:
            votosMarcos++;
            break;
        case 4:
            votosBranco++;
            break;
        case 5:
            votosNulo++;
            break;
        default:
            System.out.println("Voto inválido. Tente novamente.");
            return;
    }
    totalVotos++;
}

    private static void apurarEleicao() {
        System.out.println("\n-----------------------------------------------");
        System.out.println("| E L E I Ç Ã O ? resultado final            |");
        System.out.println("-----------------------------------------------");

        double percJoao = (votosJoao * 100.0) / totalVotos;
        double percMaria = (votosMaria * 100.0) / totalVotos;
        double percMarcos = (votosMarcos * 100.0) / totalVotos;
        double percNulo = (votosNulo * 100.0) / totalVotos;
        double percBranco = (votosBranco * 100.0) / totalVotos;

        System.out.printf("João: %d (%.2f%%) votos.%n", votosJoao, percJoao);
        System.out.printf("Maria: %d (%.2f%%) votos.%n", votosMaria, percMaria);
        System.out.printf("Marcos: %d (%.2f%%) votos.%n", votosMarcos, percMarcos);
        System.out.printf("Nulos: %d (%.2f%%) votos.%n", votosNulo, percNulo);
        System.out.printf("Brancos: %d (%.2f%%) votos.%n", votosBranco, percBranco);
        System.out.printf("Total de votos: %d%n", totalVotos);
    }

    private static void limparTela() {
        System.out.println("\nTela limpa...\n");
    }
}

