package org.example;
import java.util.Scanner;


public class Atv5Ex2 {


        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            System.out.print("Informe o valor A: ");
            int A = ler.nextInt();

            System.out.print("Informe o valor B: ");
            int B = ler.nextInt();

            System.out.print("Informe o valor C: ");
            int C = ler.nextInt();


            double R = calculaR(A, B);
            double S = calculaS(B, C);
            double D = calculaD(R, S);

            System.out.printf("O valor é: "+ D);

        }


        public static double calculaR(int a, int b) {
            return Math.pow(a + b, 2);
        }

        public static double calculaS(int b, int c) {
            return Math.pow(b + c, 3);
        }

        public static double calculaD(double r, double s) {
            return (r + s) / 2;
        }
    }


