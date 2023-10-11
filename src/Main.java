
public class Main {
    public static void main(String[] args) {
        System.out.println("arrays");

        // Задача 1

        int[] number = new int[] {1,2,3};
        for (int i = 0; i < number.length; i++) {
            if (i > 0) {
                System.out.print("");
            }
            System.out.println(number[i]);}

        double[] meaning = {1.57, 7.654, 9.986};
            for (int i = 0; i < meaning.length; i++) {
                if (i > 0) {
                    System.out.print("");
                }
                System.out.println(meaning[i]);
            }
        char[] letters = {'a','s','d'};
            for (int i = 0; i < letters.length;  i++) {
                if ( i > 0) {
                    System.out.print("");
                }
                System.out.println(letters[i]);
            }
        // Задача 2

        int[] number1 = new int[] {1,2,3};
        for (int i = 0; i < number1.length; i++) {
            if (i > 0 ) {
                System.out.print(", ");
            }
            System.out.print(number1[i]);
        }
        System.out.println("");

        double[] meaning1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < meaning1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(meaning1[i]);
        }
        System.out.println("");

        char[] letters1 = {'a','s','d'};
        for (int i = 0; i < letters1.length;  i++) {
            if ( i > 0) {
                System.out.print(", ");
            }
            System.out.print(letters1[i]);
        }
        System.out.println("");

        // Задача 3

        int[] number2 = new int[] {1,2,3};
        for (int i = number2.length - 1; i >=0; i--) {
            System.out.print(number2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print("");
        }
        System.out.println("");

        double[] meaning2 = {1.57, 7.654, 9.986};
        for (int i = meaning2.length - 1; i >= 0; i--) {
            System.out.print(meaning2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print("");
        }
        System.out.println("");

        char[] letters2 = {'a','s','d'};
        for (int i = letters2.length - 1; i >=0; i--) {
            System.out.print(letters2[i]);
            if ( i > 0) {
                System.out.print(", ");
            }
            System.out.print("");
        }
        System.out.println("");

        // Задача 4

        int[] number3 = new int[] {1,2,3};
        for (int i = 0; i < number3.length; i++) {
            if (number3 [i]  % 2 != 0) {
                number3 [i] ++;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(number3[i]);
        }
    }
}

