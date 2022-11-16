package lv.acodemy.classroom;

public class ObjectsExample {
    public static void main(String[] args) {

        Animal catBarsik = new Animal();
        catBarsik.printAllInfo();

        System.out.println();

        catBarsik.name = "Barsik";
        catBarsik.printAllInfo();

        System.out.println();

        catBarsik.hasBody = true;
        catBarsik.color = "gray";
        catBarsik.age = 5;
        catBarsik.printAllInfo();

        catBarsik.speak();
        catBarsik.feedAnimal();
        catBarsik.feedAnimal();
        System.out.println(catBarsik.eatTimes);

    }
}
