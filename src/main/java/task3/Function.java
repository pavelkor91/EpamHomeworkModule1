package main.java.task3;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Function {
    private static double a = 0;
    private static double b = 0;
    private static double h = 0;

    public static void main(String[] args) {
        readValues();
        for (double i = a; i <= b; i += h){
            System.out.printf("x = %f | f(x) = %f \n", i, function(i));
        }
    }

    private static void readValues(){
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите шаг h ");
        h = in.nextDouble();
        if (h <= 0)
        {
            System.out.println("некорректное значение h");
            readValues();
        }
        System.out.println("Введите начало отрезка а ");
        a = in.nextDouble();
        System.out.println("Введите конец отрезка b ");
        b = in.nextDouble();
        if (b < a){
            System.out.println("Конец отрезка меньше начала, введите заново");
            readValues();
        }
    }

    private static double function(double x){
        return Math.tan(2 * x) - 3;
    }

}
