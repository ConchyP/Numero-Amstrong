package com.conchy;

public class NumberAmstrong {
    

    public static boolean isAmstrong(int number) {
        int originalNumber = number;
        int lastDigit;
        double digitsQuantity = Math.floor(Math.log10(number)) + 1;
        double sum = 0;

        while (number > 0) {
            lastDigit = number % 10;
            sum += Math.pow(lastDigit, digitsQuantity);
            number /= 10;
        }

        return originalNumber == sum;
    } 

        
    public static void main(String[] args) {
        int number = 371;
        if (isAmstrong(number)) {
            System.out.println(number + " it is an Amstrong number");
        } else {
            System.out.println(number + " it is not an Amstrong number");
        }
    }
};