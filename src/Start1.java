import java.util.Random;

public class Start1 {

    public static void main(String[] args) {
        int mas[] = new int[50];
        Random r = new Random();
        int max = 0;
        int min = 0;
        System.out.println("Max and min");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(100);
            System.out.print(mas[i] + " ");

            if (i == 0) {
                max = min = mas[i];
            }

            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.print("\nMax = " + max + "\nMin = " + min);
    }
}
