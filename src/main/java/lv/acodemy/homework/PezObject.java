package lv.acodemy.homework;

import java.util.Scanner;

public class PezObject {
    public PezObject() {
    }

    public static void main(String[] args) {
        PezDispenser pawPatrol = new PezDispenser("Chase", "blue", "Paw Patrol");
        pawPatrol.printAllInfo();

        for (int i = 0; i < 13; i++) {
            pawPatrol.giveOneCandy();
        }

        for (int i = 0; i < 7; i++) {
            pawPatrol.addOneCandy();
        }

        pawPatrol.giveSeveralCandies(-6);

        pawPatrol.addSeveralCandies(-6);



    }
}












