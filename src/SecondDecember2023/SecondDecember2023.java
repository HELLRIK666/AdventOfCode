package SecondDecember2023;

import java.util.Scanner;

public class SecondDecember2023 {

    static Scanner s = new Scanner(System.in);
    static int redMax = 12;
    static int greenMax = 13;
    static int blueMax = 14;
    static int result = 0;

    public static void logic() {
        for (int i = 0; i < 5; i++) {
            String str = s.nextLine();
            System.out.println(str);
            String strWithoutGame = str.substring(5);
            System.out.println(strWithoutGame);
            int id = Integer.parseInt(strWithoutGame.substring(0,1));
            strWithoutGame = strWithoutGame.substring(3);
            System.out.println(strWithoutGame);
            System.out.println(id);
            String[] tokens = strWithoutGame.split("[,;]");

            for (String t : tokens) {
                System.out.println(t);
                if (t.contains("red") && t.length()==5) {
                    if (Integer.parseInt(t.substring(0,1)) <= redMax) {
                          result = result + id;
                    }
                }
                if (t.contains("red") && t.length()==6) {
                    if (Integer.parseInt(t.substring(0,2)) <= redMax) {
                        result = result + id;
                    }
                }
                if (t.contains("green") && t.length()==7) {
                    if (Integer.parseInt(t.substring(0,1)) <= greenMax) {
                        result = result + id;
                    }
                }
                if (t.contains("blue") && t.length()==6) {
                    if (Integer.parseInt(t.substring(0,1)) <= blueMax) {
                        result = result + id;
                    }
                }
                
            }
        }
        System.out.println("Result: " + result);
    }


    public static void main(String[] args) {
        logic();
    }
}
