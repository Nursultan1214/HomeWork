package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String homeWork;
        final int NUM = 6;
        String word = "work";
        homeWork = NUM + " " + word;
        System.out.println(homeWork);


        if (NUM <0) {
            System.out.println("Вы сохранили отрицательное число" );
        }if(NUM >0){
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили нуль");
        }


        //на сообразительность
        System.out.println("Введи ваше имя:");
        Scanner nameScanner = new Scanner(System.in);
        String myName = nameScanner.nextLine();
        System.out.println("Привет " + myName);
    }
}
