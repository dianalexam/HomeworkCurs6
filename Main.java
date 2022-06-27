package com.fasttrackit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        System.out.println(countUnevenNr(new int[]{3, 7, 8, 10, 12, 25, 55, 111, 1111111, 999}));
        System.out.println(greaterThanX(new int[]{101, 15, 222, 700, 8000, 9555}, 100));
        donations(100000);
        donationsWithThreshold(10000, 10);
        printEachPhraseFromString("Ana are mere.Merele sunt verzi.Ana va face o placinta, de mere verzi");


    }

    //scrieti o functie care primeste un sir de numere intregi si returneaza suma lor

    public static int sum(int[] integers) {
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }

        return sum;
    }

    //scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare

    public static int countUnevenNr(int[] integers) {
        int count = 0;
        for (int i : integers) {
            if (i % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    // scrieti o functie care primeste un sir de numere intregi si un alt numar intreg
    // Returnati toate numerele mai mari decat numarul primit

    public static String greaterThanX(int[] integers, int x) {
        List<Integer> output = new ArrayList<>();
        for (int i : integers) {
            if (i > x) {
                output.add(i);
            }
        }

        return output.toString();
    }

    //scrieti o functie care primeste un numar intreg reprezentand targetul de donatii
    // Donatiile se vor face cu ajutorul obiectului Random
    // Primim donatii pana cand ajungem la suma dorita
    // Cand ajungem la suma dorita afisam un mesaj de succes

    public static void donations(int target) {
        Random random = new Random();

        int donations = 0;
        while (donations != target && donations < target){
            donations += random.nextInt(target/10);
            System.out.println("Donated amount: " + donations);
        }
            System.out.println("Donation target reached");

    }

    //rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii
    //Cand acesta se termina, campania se va incheia

    public static void donationsWithThreshold(int target, int maxNr){
        Random random = new Random();

        int donations = 0;
        int donationNr = 0;
        while (donations != target && donations < target){
            donations += random.nextInt(1000);
            System.out.println("Donated amount: " + donations);
            donationNr++;

            if(donationNr == maxNr && donations >= target){
                System.out.println("Maximum number of donations & donation target have been reached");
                break;
            } else if(donationNr == maxNr && donations < target){
                System.out.println("Maximum number of donations has been reached");
                System.out.println("Total donated amount: " + donations);
                break;
            } else if (donationNr < maxNr && donations >= target){
                System.out.println("Donation target reached");
                break;
            }
        }

    }

    //scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct)
    //Printati fiecare propozitie pe o linie noua

    public static void printEachPhraseFromString(String phrase){
        String[] splitPhrase = phrase.split("\\.");
        for(String s: splitPhrase){
            System.out.println(s.toString());
        }

    }


}
