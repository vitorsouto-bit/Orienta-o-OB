import org.example.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<pet> listaPets = new ArrayList<>();
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
            sc.nextLine();

                switch (escolha) {
                    case 1:
                        cadastrarPet(listaPets);
                        break;

                    case 2:
                        CadastroPets(pets);
                        break;

                    case 3:
                        System.out.println();
                        System.out.println("================");
                        System.out.println("Camelo");
                        System.out.println("=================");
                        sair = true;
                        break;

                    case 4:
                        System.out.println("raça do seu pet");
                        System.out.println("====================");
                        System.out.println("1 - caramelo");
                        System.out.println("2 - yorshire");
                        System.out.println("3 - poodle");
                        System.out.println("4 - rottweiler");
                }


            } while (!sair);
        }
    }
    private static void CadastroPets(Scanner scanner) {
    System.out.println("digite o nome do pet");
        Pet pet = new  pet();
        pet.

    }

    private static void cadastrarPet(List<pet> pets) {
    }

    private static class pet {
    }


public void main() {
    String nome = Sc.ne


