package com.projetono;

public class Main {
    public static void main(String[] args) {
        No <String>no1 = new No<String>("Bruno");
        No <String>no2 = new No<String>("Juliana");
        No <String>no3 = new No<String>("Miguel");
        No <String>no4 = new No<String>("Maju");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());
        System.out.println(no2);


    }
}
