import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Shell {

    public static void main(String[] args) {
        System.out.print("\n> ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            String com = scan.nextLine();
            switch (com) {
                case "time":
                    System.out.println(LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond());
                    break;
                case "date":
                    System.out.println(LocalDate.now().getDayOfMonth() + "." + LocalDate.now().getMonthValue() + "." + LocalDate.now().getYear());
                    break;
                case "quit":
                    System.exit(0);
                default:
                    System.out.println("Неизвестная команда! Введите еще раз!");
            }

            System.out.print("> ");
        }
    }
}
