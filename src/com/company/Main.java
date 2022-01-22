package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ClientBase client = new ClientBase();
        Scanner sc = new Scanner(System.in);

        System.out.println("1-Создание базы клиентов\t2-информация о клиентах\t" +
                "3-сведения об абонентах, у которых время внутригородских разговоров превышает заданное;\n" +
                "4-сведения об абонентах, которые пользовались междугородной связью\t" +
                "5-сведения об абонентах в алфавитном порядке\n" +
                "6-сведения об первых 10 абонентов у который самый большой трафик интернета\t" +
                "7-конец программы");

        byte k = 0;
        while (true) {
            System.out.print("Введите номер: ");
            byte i = sc.nextByte();
            if (i == 1) {
                k = 1;
                client.createClients();//Создание базы клиентов
            }
            if (k == 1) {
                if (i == 2) {
                    client.ClientsInfo();//информация о клиентах
                } else if (i == 3) {
                    System.out.println("Введите время");
                    int time = sc.nextInt();
                    client.ExceedsSpecified(time);//сведения об абонентах, у которых время внутригородских разговоров превышает заданное
                } else if (i == 4) {
                    client.intercityCommunication();//сведения об абонентах, которые пользовались междугородной связью
                } else if (i == 5) {
                    client.alphabeticalOrder();//сведения об абонентах в алфавитном порядке
                } else if (i == 6) {
                    client.LargestTraffic();//сведения об первых 10 абонентов у который самый большой трафик интернета
                }
            }
            if (i == 7) {
                System.out.println("Конец работы с программой");
                break;
            }
        }
    }
}



