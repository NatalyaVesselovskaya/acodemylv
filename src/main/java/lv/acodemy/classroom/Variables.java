package lv.acodemy.classroom;

public class Variables {
    public static void main(String[] args) {

        byte byteVariable = 120;
        System.out.println(byteVariable);

        short salary = 2000;
        System.out.println(salary);

        char letterA = 'A';
        System.out.println(letterA);

        int populationInLatvia = 2000000;
        System.out.println(populationInLatvia);

        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);

        float stockPrice = 5000.50f;
        System.out.println(stockPrice);

        long coronavirusCases = 63614776L;
        System.out.println(coronavirusCases);

        double twitterPriceInEur = 20659.54;
        System.out.println(twitterPriceInEur);

        boolean isSummer = false;
        boolean isAutumn = true;
        boolean hasValue = true;

        System.out.println(isAutumn);

        String name = "Natalya";
        System.out.println(name);

        String surname = "Vesselovskaya";
        System.out.println(name + " " + surname);

        System.out.print("Hello World\n");
        System.out.print("Today is...");

        String fullName = String.format("\nHello %s. I guess your surname is: %s", name, surname);
        // %s - for text
        // %d = for numbers
        System.out.println(fullName);

        int number = 1994;
        System.out.println("My name is " + name + "." + "I was born in " + number);
        System.out.println(10 + 40);
        System.out.println("Summ:" + (10 + 40));

        int res = 10 + 40;
        System.out.println("Summ:" + res);





    }

}
