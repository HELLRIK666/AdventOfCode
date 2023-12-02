package SecondDecember2023;

import java.util.Scanner;

public class SecondDecember2023 {

    static Scanner s = new Scanner(System.in);
    static int redMax = 12;
    int greenMax = 13;
    int blueMax = 14;
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
                if (t.contains("red")) {
                    if (Integer.parseInt(t.substring(0,1)) > redMax) {
                          result = result + id;
                    }
                }
                
            }
        }
    }


    public static void main(String[] args) {
        logic();
    }
}
