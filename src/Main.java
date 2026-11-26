public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 2.");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 3.");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 4.");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 5.");
        for (int i = 1904; i >= 1904 && i <= 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }

        System.out.println("Задача 6.");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 7.");
        for (int i = 1; i < 600; i = i * 2) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача 8.");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }

        System.out.println("Задача 9.");
        int bank = 29000;
        int all = 0;
        for (int i = 1; i <= 12; i++) {
            all = all + bank;
            all = all + bank / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + all);
        }

        System.out.println("Задача 10.");
        for (int i = 2; i <= 10; i = i + 1) {
            int b = i * 2;
            System.out.println("2 * " + i + " = " + b);
        }
    }
}