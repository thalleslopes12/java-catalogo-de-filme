package org.example;
import java.util.Scanner;


public class Atv4Ex6 {



        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            double[] valor = new double[3];
            double[] subtotal = new double[3];
            int[] quantidade = new int[3];
            double valorTotal = 0.0;
            String[] nome = new String[3];

            for (int x = 0; x < 3; x++) {
                System.out.print("\nInforme o nome do produto: ");
                nome[x] = ler.nextLine();
                System.out.print("Informe a quantidade do produto: ");
                quantidade[x] = ler.nextInt();
                System.out.print("Informe o valor do produto: ");
                valor[x] = ler.nextDouble();
                ler.nextLine();

                subtotal[x] = valor[x] * quantidade[x];
                valorTotal += subtotal[x];
            }

            for (int x = 0; x < 3; x++) {
                System.out.printf("\nO subtotal do produto" +nome[x]+ "é de: R$"+subtotal[x]);



            }
            System.out.printf("\nO valor total é de: R$"+valorTotal);

        }
    }
