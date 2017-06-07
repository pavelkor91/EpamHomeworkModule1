package main.java.task2;


import java.util.Locale;
import java.util.Scanner;

public class FindMin {

    private static double eps = 0.000001;
    private static int n = 0;

    public static void main(String[] args) {
        readEps();
        findMin();
    }

    private static void readEps(){
        System.out.println("Enter eps");
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        eps = in.nextDouble();
        System.out.println("Enter N");
        n = in.nextInt();
    }

    private static void findMin(){
        for(int i = 1; i < n; i++){
            double a = 1 / Math.pow((i + 1), 2);
            System.out.println(a);
            if (a < eps)
            {
                System.out.printf("Наименьший номер в последовательности удовлетворяющий an < eps = %d", i);
                return;
            }

        }
    }
}
