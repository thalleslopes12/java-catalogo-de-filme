package org.example;
import java.util.Scanner;

public class Atv3Ex8 {

 public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int nr, maior = 0, menor = 2038294723;

            for (int cont = 1; cont <= 5; cont++) {
                System.out.print("Informe o " + cont + "º número: ");
                nr = ler.nextInt();

                if (nr > maior) {
                    maior = nr;
                }

                if (nr < menor) {
                    menor = nr;
                }
            }


            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);


        }
    }


