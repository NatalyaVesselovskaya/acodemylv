package lv.acodemy.classroom;

import java.util.Arrays;

public class LoopsExample {
    public static void main(String[] args) {

        // for
        // counter - int = 0;
        // condition
        // increment++ (i++ = +1; i-- = -1)
        // (i++) i = i + 1
        // (i--) i = i - 1

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!" + i);
        }
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < dayOfTheWeek.length; i++) {
            System.out.println(dayOfTheWeek[i]);
        }
        System.out.println();
        //print from Monday to Thursday
        for (int i = 0; i < 4; i++) {
            System.out.print(dayOfTheWeek[i] + " ");
        }
        System.out.println();
        // for each
        for (String day : dayOfTheWeek) {
            System.out.print(day + " ");
        }
        System.out.println();
        //brake;
        //continue;
        for (String day : dayOfTheWeek) {
            if (day.equals("Friday")) {
                System.out.println("Friday exists!");
                break;
            }
        }
        //Ex.1:
        //Print numbers from 10 to 0;

        //Ex.2;
        //Create array of numbers int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        //Print numbers in reverse order like: 10,9,8...1;
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // while
        int number = 0;
        while (number < 5) {
            System.out.println("Hello World!");
            number++;
        }
        // number = 5 after this cycle

        System.out.println();

        //do while
        number = 0;
        do {
            System.out.println("Hello World!");
            number++;
        } while (number < 5);


    }
}
