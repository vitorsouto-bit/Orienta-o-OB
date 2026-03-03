package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<Pet>();
        boolean sair = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("================");
        System.out.print("bem vindo ao Petshop");

        do {
            System.out.println("Escolha um dos números");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Exibir pets");
            System.out.println("3 - Sair ");
            System.out.println("=================");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    cadastrarPet(pets);
                    break;

                case 2:
                    exibirPetsCadastro(pets);
                    break;

                case 3:
                    System.out.println();
                    System.out.println("================");
                    System.out.println("Camelo");
                    System.out.println("=================");
                    sair = true;
                    break;
            }


        } while (!sair);
    }

    private static void exibirPetsCadastro(List<Pet> pets) {
    }

    private static void cadastrarPet(List<Pet> pets) {
    }
}


