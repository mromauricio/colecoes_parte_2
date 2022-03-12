package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos nomes desejar informar? ");
        int quantity = sc.nextInt();
        sc.nextLine();
        List<String> maleList = new ArrayList<>();
        List<String> femaleList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.print("Informe o " + (i+1) + "° nome: ");
            String name = sc.nextLine();
            System.out.print("Esta pessoa é do sexo <F>eminino ou <M>asculino? ");
            String gender = sc.nextLine();
            if ("F".equals(gender.toUpperCase())) femaleList.add(name);
            else if ("M".equals(gender.toUpperCase())) maleList.add(name);
            else System.out.println("Não identifiquei o sexo informado");
        }
        System.out.println("Lista dos homens:");
        for (String male : maleList) System.out.println(" - " + male);
        System.out.println("Lista das mulheres:");
        for (String female : femaleList) System.out.println(" - " + female);
        sc.close();
    }
}
