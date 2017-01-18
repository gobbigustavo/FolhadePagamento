package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de Folha de Pagamento!\n\n" +
                "O sistema possui as seguintes funções:\n\n" +
                "1 - Adicionar um empregado\n" +
                "2 - Remover um empregado\n" +
                "3 - Lançar um Cartão de Ponto\n" +
                "4 - Lançar um Resultado Venda\n" +
                "5 - Lançar uma Taxa de Serviço\n" +
                "6 - Alterar detalhes de um empregado\n" +
                "7 - Rodar a folha de pagamento para hoje\n" +
                "8 - Mostrar agenda de pagamento\n" +
                "9 - Alterar detalhes de um empregado\n\n" +
                "Escolha uma das funções acima: ");

        int Escolha;

        Scanner scanIn = new Scanner(System.in);
        Escolha = Integer.parseInt(scanIn.nextLine());

        scanIn.close();
        System.out.println("Você escolheu: " + Escolha);

        if (Escolha == 1) {
            System.out.println("Entrou 1");
        } else if (Escolha == 2) {
            System.out.println("Entrou 2");
        } else if (Escolha == 3) {
            System.out.println("Entrou 3");
        } else if (Escolha == 4) {
            System.out.println("Entrou 4");
        } else if (Escolha == 5) {
            System.out.println("Entrou 5");
        } else if (Escolha == 6) {
            System.out.println("Entrou 6");
        } else if (Escolha == 7) {
            System.out.println("Entrou 7");
        } else if (Escolha == 8) {
            System.out.println("Entrou 8");
        } else if (Escolha == 9) {
            System.out.println("Entrou 9");
        } else {
            System.out.println("Erro");
        }
    }
}
