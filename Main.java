package com.challenge;

public class Main {
    public static void main(String[] args) {
        isPalindrome(-1221);

    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int numberCopy = number;
        int reverse = 0;
        int lastDigit = 0;
        while (numberCopy > 0) {
            lastDigit = number % 10;
            reverse  = reverse * 10;
            numberCopy /= 10;
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }

    }
}