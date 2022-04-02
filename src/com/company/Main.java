package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Lüften sıcaklık giriniz :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 25) {
            System.out.println("Sinemaya gidebilirsiniz");
            if (heat >= 10 && heat <= 25) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}


