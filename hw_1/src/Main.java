import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numberOfStudents;
        final int NUM = 5;
        String word = "cake";
        numberOfStudents = NUM + word;
        System.out.println(numberOfStudents + NUM + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scaner = new Scanner(System. in);
        System.out.println("Введите ваше имя:");
        String userName = scaner.nextLine();
        System.out.println("Привет,"+ userName+"!");
    }
}
