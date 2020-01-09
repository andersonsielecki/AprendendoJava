package com.cursojava.CursoJava;

    import java.util.Scanner;

public class MeuPrograma {

    public static void main(String[] args) {
        // Exemplo 1
        //  String varNome = "Anderson";
        //  System.out.println("Meu nome é " + varNome);


        //Scanner sc1 = new Scanner(System.in);
        //System.out.println("Digite o nome completo ");

        //String meuNome = sc1.nextLine();
        //System.out.println("O nome é " + meuNome);

        /* Calculadora
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        String nPrimeiro = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite o segundo valor: ");
        String nSegundo = sc2.nextLine();

        Integer sTotal = Integer.valueOf (nPrimeiro) + Integer.valueOf(nSegundo);
        System.out.println("A SOMA é: " + sTotal );
        */

        /*
        if (sTotal < 0) {
            System.out.println("Valor menor que zero ");

        }else {
            System.out.println("Valor maior que zero ");
            }
        */
        /* Exercicio 01 */

            Integer nMaior = 0;
            int[] idades = new int[15];

            for (int i = 0; i < 15; i++) {
                idades[i] = i * 10;
            }

            for (int i = 0; i < 15; i++) {

                if (idades[i] > nMaior) {
                    nMaior = idades[i];
                }
                if (i == 12) {
                    idades[12] = 190;
                    nMaior = idades[i];
                }


                System.out.println("Idade " + i + " " + idades[i]);
            }


            System.out.println("O MAIOR É: " + nMaior);










    }

}
