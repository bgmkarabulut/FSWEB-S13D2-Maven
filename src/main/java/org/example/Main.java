package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPerfectNumber(6));
        System.out.println(numberToWords(15));
    }

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reversedNumber = 0;

        // Negatif sayılar için pozitif hale getirme
        number = Math.abs(number);

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        return originalNumber == reversedNumber || originalNumber == -reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;


        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
    public static String numberToWords(int num){
        if(num<0){
            return "Invalid Value";
        }
        if(num==0){
            return "zero";
        }
        StringBuilder result= new StringBuilder(" ");
        while(num>0){
            int digit=num%10;
            result.insert(0, digitToWord(digit) + " ");
            num/=10;
        }
        return result.toString().trim();
    }
    private static String digitToWord(int digit) {
        return switch (digit) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";
        };
    }


}





