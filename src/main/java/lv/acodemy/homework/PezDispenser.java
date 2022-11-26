package lv.acodemy.homework;

public class PezDispenser {

    private String title;
    private String color;
    private String model;
    private int candyQuantity = 12;


    public PezDispenser(String title, String color, String model) {
        this.title = title;
        this.color = color;
        this.model = model;

    }

    public String getTitle() {
        return title;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }


    public void printAllInfo() {
        System.out.println("This PEZ is called " + title);
        System.out.println("The color is " + color);
        System.out.println("The model is " + model);
        System.out.println("Quantity of candies is " + candyQuantity);
    }

    public void addOneCandy() {
        addSeveralCandies(1);
    }

    public void giveOneCandy() {
        giveSeveralCandies(1);

    }

    public static String candPostfix(int amountOfCandies) {
        String postfix;
        if (amountOfCandies == 1) {
            postfix = "y";
        } else {
            postfix = "ies";
        }
        return postfix;
    }

    public void pezStatus() {
        System.out.println("PEZ has " + candyQuantity + " cand" + candPostfix(candyQuantity));
    }


    public void giveSeveralCandies(int amountOfCandies) {
        if (amountOfCandies <= 0)
            System.out.println("Apparently, you don't want me to give you candies.");
        else if (candyQuantity >= amountOfCandies) {
            candyQuantity = candyQuantity - amountOfCandies;
            System.out.println("- You've taken " + amountOfCandies + " cand" + candPostfix(amountOfCandies));
        } else
            System.out.println("Sorry, no candies left :( Fill me up!");
        pezStatus();
    }


    public void addSeveralCandies(int amountOfCandies) {
        if (amountOfCandies <= 0)
        System.out.println("Oops, you forgot to add candies.");
        else if (candyQuantity + amountOfCandies < 12) {
            candyQuantity = candyQuantity + amountOfCandies;
            System.out.println("+ You've added " + amountOfCandies + " cand" + candPostfix(amountOfCandies));
        } else
            System.out.println("I'm full, you can't add more candies");
        pezStatus();
    }
}







