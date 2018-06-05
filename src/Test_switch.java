public class Test_switch {
    public static int a;

    public static void main(String[] arg) {
        switch (a) {
            case 10:
                System.out.println("Привет");
                break;
            case 20:
                System.out.println("Пока!");
                break;
            default:
                System.out.println("Ошибочка!");
        }
    }
}
