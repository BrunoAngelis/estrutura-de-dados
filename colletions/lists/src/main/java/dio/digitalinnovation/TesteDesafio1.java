package dio.digitalinnovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class TesteDesafio1 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList<>();
        Double soma = 0.0;

        for(int i = 1 ; i <=6 ; i++) {
         System.out.print("Digite a temperatura do mes "+i+": ");
         Double temperatura = scann.nextDouble();
         temperaturasSemestral.add(temperatura);
         soma += temperatura;
        }

        Double mediaSemestral = soma/temperaturasSemestral.size();

        System.out.println("--------------------");
        System.out.println("Temperatura semestral --> " + temperaturasSemestral);
        System.out.println("Media temperatura semestral --> " + mediaSemestral);

        System.out.println("---- Temperaturas acima da media semestral -----");
        for (Double temp : temperaturasSemestral){
            if (temp > mediaSemestral){
                int index  = temperaturasSemestral.indexOf(temp);
                switch (index){
                    case 0 :
                        System.out.println((index+1)+ " - Janeiro: "+temp+"oC" );
                        break;
                    case 1 :
                        System.out.println((index+1)+ " - Fevereiro: "+temp+"oC" );
                        break;
                    case 2 :
                        System.out.println((index+1)+ " - Marco: "+temp+"oC" );
                        break;
                    case 3 :
                        System.out.println((index+1)+ " - Abril: "+temp+"oC" );
                        break;
                    case 4 :
                        System.out.println((index+1)+ " - Maio: "+temp+"oC" );
                        break;
                    case 5 :
                        System.out.println((index+1)+ " - Junho: "+temp+"oC" );
                        break;
                }
            }
        }
    }
}
