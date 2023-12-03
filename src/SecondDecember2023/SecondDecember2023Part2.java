package SecondDecember2023;

import java.util.Scanner;

public class SecondDecember2023Part2 {

    static Scanner s = new Scanner(System.in);
    static int redMax = 12;
    static int greenMax = 13;
    static int blueMax = 14;
    static int result = 0;

    public static void logic() {
        for (int i = 0; i < 100; i++) {
            boolean bool = true;
            String str = s.nextLine();
            System.out.println(str);



            String strWithoutGame = str.substring(5);
            System.out.println(strWithoutGame);

            String[] tokens1 = strWithoutGame.split("[:]");
            System.out.println("Tokens1 - del 1: " + tokens1[0]);
            System.out.println("Tokens1 - del 2: " + tokens1[1]);

            int id = Integer.parseInt(tokens1[0]);
            strWithoutGame = tokens1[1];
            System.out.println("strWithoutGame: " + strWithoutGame);
            System.out.println("id: " + id);
            String[] tokens = strWithoutGame.split("[,;]");

            for (String t : tokens) {
                System.out.println("t: " + t);
                if (t.contains("red") && t.length()==6) {
                    if (Integer.parseInt(t.substring(1,2)) > redMax) {
                        System.out.println("t.substring(1,2) : " + t.substring(1,2));
                        bool = false;
                        //result = result + id;
                    }
                }
                if (t.contains("red") && t.length()==7) {
                    if (Integer.parseInt(t.substring(1,3)) > redMax) {
                        System.out.println("t.substring(1,3) : " + t.substring(1,3));
                        bool = false;
                        //result = result + id;
                    }
                }
                if (t.contains("green") && t.length()==8) {
                    if (Integer.parseInt(t.substring(1,2)) > greenMax) {
                        bool = false;
                        //result = result + id;
                    }
                }
                if (t.contains("green") && t.length()==9) {
                    if (Integer.parseInt(t.substring(1,3)) > greenMax) {
                        bool = false;
                        //result = result + id;
                    }
                }
                if (t.contains("blue") && t.length()==7) {
                    if (Integer.parseInt(t.substring(1,2)) > blueMax) {
                        bool = false;
                        //result = result + id;
                    }
                }
                if (t.contains("blue") && t.length()==8) {
                    if (Integer.parseInt(t.substring(1,3)) > blueMax) {
                        bool = false;
                        //result = result + id;
                    }
                }

            }
            System.out.println(bool);
            if (bool) {result = result + id;}
        }
        System.out.println("Result: " + result);
    }


    public static void main(String[] args) {
        logic();
    }
}
