import  java.lang.System;
import  java.util.Scanner;

public class Area {
    private static double pi =3.14;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        System.out.println(r*r*pi);
    }

}
