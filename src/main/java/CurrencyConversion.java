/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
        System.out.printf("How many euros are you exchanging? ");
        double euros = sc.nextDouble();
        System.out.printf("What is the exchange rate? ");
        double exchangeRate = sc.nextDouble();
        double dollars = currencyConverter(euros, exchangeRate,result);
        System.out.printf("%.0f euros at an exchange rate of " + exchangeRate + " is \n", euros);
        System.out.printf("%.2f U.S. dollars.", dollars);
        sc.close();
    }
    private static double currencyConverter(double euros, double exchangeRate,double result) {
        return result = euros * exchangeRate;
    }
}
