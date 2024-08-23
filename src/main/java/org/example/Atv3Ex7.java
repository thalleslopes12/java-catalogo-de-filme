package org.example;
import java.util.Scanner;

public class Atv3Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double testada, profundidade, area;



            System.out.print("informe a largura do terreno: ");
            testada = scanner.nextDouble();

            System.out.print("Informe a profundidade do terreno: ");
            profundidade = scanner.nextDouble();

            area = testada * profundidade;

            System.out.printf("Área do terreno: " +area+" M2");

         while (area > 100);


    }

}


