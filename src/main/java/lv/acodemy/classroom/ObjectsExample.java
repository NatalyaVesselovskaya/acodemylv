package lv.acodemy.classroom;

public class ObjectsExample {
    public static void main(String[] args) {

        Animal catBarsik = new Animal("Barsik", "gray", 0,true);
        catBarsik.printAllInfo();

        Animal dogRex = new Animal();

        catBarsik.speak();

        for (int i = 0; i < 5; i++) {
            catBarsik.feed();
        }

        for (int i = 0; i < 5; i++) {
            catBarsik.walk();
        }

        int times = 5;
        while (times > 0) {
            catBarsik.feed();
            times--;
        }

        System.out.println("Energy: " + catBarsik.getEnergy());

        catBarsik.setAge(1);
        catBarsik.setAge(1);
        catBarsik.setAge(5);
        System.out.println("Age now is :" + catBarsik.getAge());


        catBarsik.play();
        catBarsik.play();
        catBarsik.play();
        catBarsik.feed();
        catBarsik.play();
        catBarsik.feed();
        catBarsik.feed();
        catBarsik.play();

    }
}