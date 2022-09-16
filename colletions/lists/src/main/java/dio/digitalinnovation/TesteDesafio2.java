package dio.digitalinnovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class TesteDesafio2 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        List<String> interrogatorio = new ArrayList<>();
        String resposta;

        System.out.println("\t----Interrogatorio----\t");
        System.out.print("Telefonou para a vitima?: ");
        resposta = scann.next();
        interrogatorio.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime?: ");
        resposta = scann.next();
        interrogatorio.add(resposta.toLowerCase());
        System.out.print("Mora perto da vitima?: ");
        resposta = scann.next();
        interrogatorio.add(resposta.toLowerCase());
        System.out.print("Devia para a vitima?: ");
        resposta = scann.next();
        interrogatorio.add(resposta.toLowerCase());
        System.out.print("Ja trabalhou com a vitima?: ");
        resposta = scann.next();
        interrogatorio.add(resposta.toLowerCase());

        int count = 0 ;

        for(String resp : interrogatorio){
            if(resp.contains("s")){
                count++;
            }
        }

        System.out.println("\t----Sentenca----\t");
        switch (count){
            case 2 :
                System.out.println("Suspeita!");
                break;
            case 3:
                System.out.println("Cumplice!");
                break;
            case 4:
                System.out.println("Cumplice!");
                break;
            case 5:
                System.out.println("Assasina!");
                break;
            default:
                System.out.println("Inocente!");
                break;
        }
    }
}
