package SecondDecember2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondDecember2023Part2 {

    static Scanner s = new Scanner(System.in);
    static int result = 0;


    public static void logic() {
        for (int i = 0; i < 100; i++) {
            String str = s.nextLine();

            String strWithoutGame = str.substring(5);

            String[] tokens1 = strWithoutGame.split("[:]");

            strWithoutGame = tokens1[1];

            String[] tokens = strWithoutGame.split("[,;]");
            int powerRed;
            int powerGreen;
            int powerBlue;
            ArrayList<Integer> redList = new ArrayList<>();
            ArrayList<Integer> greenList = new ArrayList<>();
            ArrayList<Integer> blueList = new ArrayList<>();


            for (String t : tokens) {
                System.out.println("t: " + t);
                if (t.contains("red") && t.length() == 7) {

                    powerRed = Integer.parseInt(t.substring(1, 3));

                    redList.add(powerRed);

                }
                if (t.contains("red") && t.length() == 6) {


                    powerRed = Integer.parseInt(t.substring(1, 2));

                    redList.add(powerRed);

                }
                if (t.contains("green") && t.length() == 9) {

                    powerGreen = Integer.parseInt(t.substring(1, 3));

                    greenList.add(powerGreen);

                }
                if (t.contains("green") && t.length() == 8) {

                    powerGreen = Integer.parseInt(t.substring(1, 2));

                    greenList.add(powerGreen);
                }
                if (t.contains("blue") && t.length() == 8) {

                    powerBlue = Integer.parseInt(t.substring(1, 3));

                    blueList.add(powerBlue);
                }
                if (t.contains("blue") && t.length() == 7) {
                    powerBlue = Integer.parseInt(t.substring(1, 2));

                    blueList.add(powerBlue);
                }


            }
            powerRed = Collections.max(redList);
            powerGreen = Collections.max(greenList);
            powerBlue = Collections.max(blueList);

            result = result + (powerRed * powerGreen * powerBlue);


        }
        System.out.println("Result: " + result);
    }


    public static void main(String[] args) {
        logic();
    }
}
