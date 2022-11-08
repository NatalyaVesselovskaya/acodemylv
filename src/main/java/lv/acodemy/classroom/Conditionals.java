package lv.acodemy.classroom;

public class Conditionals {
    public static void main(String[] args) {
        //Operator: IF
        //boolean: true/false
        //5>2 (true)
        //10<1 (false)
        if(1 < 2) {
            System.out.println("Hello World!");
        }

        if(10 < 1) {
            System.out.println("Hello World!");
        }
        //boolean
        boolean isNikitaToxic = true;
        if(isNikitaToxic) {
            System.out.println("Spank him!");
        }
        //String example
        String myCity = "Riga";
        if(myCity.equals("Riga")) {
            System.out.println("Yes, city is Riga!");
        }
        String capitalOfFrance = "London";
        if(myCity.equals("Paris")) {
            System.out.println("Yes, the capital is Paris!");
        }

        if(myCity.contains("iga")) {
            System.out.println("Yes, city is Riga!");
        }

        String name = "John";
        if(!name.equals("Natalya")) {
            System.out.println(name + " is not Natalya, so it can be registered");
        }

        //if-else
        int age = 20;
        if(age < 18) {
            System.out.println("Please come later!");
        } else {
            System.out.println("You can buy anything you want! Your age is:" + age);
        }
        //<= less or equals
        // => more or equals

        //if-else-if-else

        //currentTime <= 11 && currentTime >6 -> Good morning!
        //currentTime > 11 & currentTime <17 -> Good day!
        //currentTime > 17 & currentTime < 24 -> Good evening!
        //else -> Good night!

        // || means OR (should be at least one true in order to return true)

        int currentTime = 24;
        if(currentTime <= 11 && currentTime >= 6) {
            System.out.println("Good morning!");
        } else if(currentTime > 11 && currentTime <= 17) {
            System.out.println("Good day!");
        } else if(currentTime > 17 && currentTime <= 24) {
            System.out.println("Good evening!");
        } else if(currentTime >= 0 && currentTime < 6) {
            System.out.println("Good night!");
        } else {
            System.out.println("Current time is not correct " + currentTime);
        }

    }
}
