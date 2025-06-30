package org.example;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Converts Celsius to Fahrenheit
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature in Celsius: ");
        float celsius = scanner.nextFloat();
        System.out.print("Temperature in Fahrenheit: " + String.format("%.2f", cToFahrenheit(celsius)));

    }

    private static double cToFahrenheit(float celsius){
        return celsius * 1.8 + 32;
    }

}