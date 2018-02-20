package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 2b.
        //​
        // Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje
        //turi būti atvaizduojama įvestų skaičių suma.

        int skaicius;
        Scanner in = new Scanner(System.in);
        int suma = 0;

        do{
            System.out.println("Iveskite skaiciu");
            skaicius = in.nextInt();
            suma += skaicius;
        }while (skaicius != 0);
        System.out.println("Skaicius suma: " + suma);
    }
}
