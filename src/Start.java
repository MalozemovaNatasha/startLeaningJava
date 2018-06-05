import java.util.Random;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
//        int mas[] = new int[10];
//        Random r = new Random();
//        System.out.println("Первый массив Random");
//        for (int i=0; i<mas.length; i++){
//            mas[i] = r.nextInt(100);
//            System.out.println(mas[i]);
//        }

//        System.out.println("Чет/нечет");
//        for (int i=1; i<=100; i++){
//            if (i%2==0) {
//                System.out.println(i + " - чет");
//            } else {
//                System.out.println(i + " - нечет");
//            }
//        }

//        System.out.println("Среднее арифметическое");
//        double mas[] = new double[10];
//        double sum = 0;
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = Math.random() * 10;
//            System.out.print(mas[i] + " ");
//            sum += mas[i];
//        }
//
//        System.out.println("\nСреднее арифметическое - " + sum/mas.length);

//        int mas1[] = {1, 10, 8 , 15, 159, 12 , 52, 888};
//        System.out.println("\n"+"Второй массив");
//        for (int i: mas1){
//            System.out.println(i);
//        }

//        System.out.println("Чет/нечет");
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        String[] mas = s.split(" ");
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }

        System.out.println("Таблица");
        int mas[][] = new int[10][10];
        System.out.println();
        for (int j = 1; j < 10; j++) {
            System.out.print("\t" + j);
        }
        System.out.println("\n---------------------------------------");

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.print(i + "|\t");
                    continue;
                }
                mas[i][j] = i * j;
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
