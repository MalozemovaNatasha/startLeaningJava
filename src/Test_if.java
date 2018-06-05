import java.util.Scanner;

public class Test_if {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        if (in.nextInt() > 10) {
            System.out.println("Привет");
        } else {
            System.out.println("Пока!");
        }

    }
}
