import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String nums = "0123456789";
        String al = "qwertyuiopasdfghjklzxcvbnm";
        String els = ":',.?/!@#$%^&*()_+-=~`";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел в пароле: ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("Введите количество букв в пароле: ");
        int als = Integer.parseInt(sc.nextLine());

        System.out.println("Введите количество спец.символов в пароле: ");
        int el = Integer.parseInt(sc.nextLine());

        StringBuilder s = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < num; i++) {
            s.append(nums.charAt(r.nextInt(num)));
        }

        for (int i = 0; i < als; i++) {
            s.append(al.charAt(r.nextInt(als)));
        }

        for (int i = 0; i < el; i++) {
            s.append(els.charAt(r.nextInt(el)));
        }

        System.out.println("Сгенерированный пароль: " + s.toString());
    }
}

