package lv.acodemy.classroom;

public class Animal {

    private String name;
    private String color;
    private int age;
    private boolean hasBody;
    private int eatTimes;
    private int energy = 4;

    public Animal(String name, String color, int age, boolean hasBody) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.hasBody = hasBody;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public boolean hasBody() {
        return hasBody;
    }

    public int getEatTimes() {
        return eatTimes;
    }

    public int getEnergy() {
        return energy;
    }

    public void setAge(int age) {
        if (this.age == age) {
            System.out.println("Same age provided, please try again");
        } else if (age > 0 && age <= 25) {
            this.age = age;
            System.out.println("Age now is :");
        } else {
            System.out.println("Can't set age");
        }
    }

        public void printAllInfo () {
            System.out.println("Has body:" + hasBody());
            System.out.println("Name:" + getName());
            System.out.println("Age:" + getAge());
            System.out.println("Color:" + getColor());
        }

        public void speak () {
            System.out.println("MRRRRRR!");
        }

        public void feedAnimal () {
            System.out.println("Omnonmnom!");
            eatTimes++;
        }

        public int getFeedTimes () {
            return eatTimes;
        }

        public void walk () {
            if (energy <= 0) {
                System.out.println("Not enough energy to walk!");
            } else {
                System.out.println("Walking...");
                energy--;
            }
        }
        public void feed () {
            if (energy < 4) {
                energy++;
                System.out.println("Omnonom");
            } else {
                System.out.println("Can't eat because I'm full");
            }

        }

        public void play () {
        if (energy < 2) {
            System.out.println("Not enough energy. Feed me first!");
        } else {
            energy -= 2;
            System.out.println("Let's play!");
        }
        }

    public Animal() {
    }
}