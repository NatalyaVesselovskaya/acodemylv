package lv.acodemy.classroom;

public class Animal {

    public String name;
    public String color;
    public int age;
    public boolean hasBody;
    public int eatTimes;

    public void printAllInfo() {
        System.out.println("Has body:" + hasBody);
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Color:" + color);
    }

    public void speak() {
        System.out.println("MRRRRRR!");
    }

    public void feedAnimal() {
        System.out.println("Omnonmnom!");
        eatTimes++;
    }

    public int getFeedTimes() {
        return eatTimes;
    }
}
