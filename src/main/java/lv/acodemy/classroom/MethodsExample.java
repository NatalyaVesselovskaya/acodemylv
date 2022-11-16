package lv.acodemy.classroom;

import java.sql.SQLOutput;

public class MethodsExample {
    public static void main(String[] args) {
        printMyFullName();
        printMyFullName("John", "Doe");
        printInformationAboutMe("Natalya", "Vesselovskaya", 33);
        String name = "John";
        String lastName = "Doe";

        printMyFullName(name, lastName);
        System.out.println(sum(10, 20));


//вот тут не поняла Оо
        int twoNumberSum = sum(50, 60);
        System.out.println(twoNumberSum);

        System.out.println(square(6));

        for (int i = 0; i < 3; i++) {
            printMyFullName("Max", "Payne");
        }
        System.out.println();

        System.out.println(isPalindrome("tenet"));

        printInfoAboutMeTimes("John", "Doe", 25, 6);

    }


    public static void printMyFullName() {
        System.out.println("Natalya Vesselovskaya");
    }

    public static void printMyFullName(String name, String lastname) {
        System.out.println(name + " " + lastname);
    }

    public static void printInformationAboutMe(String name, String lastName, int age) {
        System.out.println("My name is " + name + "." + " My last name is " + lastName + "." + " I am is " + age + " years old.");
    }

    // ("My name is %s. My last name is %s. I am %s years old%n", name, lastName, age);
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int square(int x) {
        // int result = x * x;
        // return result;
        // return (int) Math.pow(x, 2); -вернет только целое число
        return x * x;
    }

    public static boolean isPalindrome(String palindromeWord) {
        String word = "";
        // t e n e t
        // t = [0]
        // e = [1]
        // ... t = [4]
        for (int i = palindromeWord.length() - 1; i >= 0; i--) {
            word = word + palindromeWord.charAt(i);
            // "" = "" + "t" (1st iteration)
            // "t" = "t" + "e" (2nd iteration)
            // "te" = "te" + "n" (3rd iteration)
        }
        System.out.println("Word = " + word);
        return word.equals(palindromeWord);
    }

    public static void printInfoAboutMeTimes(String name, String lastName, int age, int loopCount) {
        for (int i = 0; i < loopCount; i++) {
            System.out.println("My name is " + name + "." + " My last name is " + lastName + "." + " I am is " + age + " years old.");
        }

    }


}
