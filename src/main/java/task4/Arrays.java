package main.java.task4;


import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Arrays {
    private static double[] array;

    public static void main(String[] args) {
        menu();
        System.out.printf("max = %f", findMax());
    }
    private static void menu(){
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int key;
        System.out.println("Выберите способ заполнения массива: \n 1 - Вручную \n 2 - Случайным образом");
        key = in.nextInt();
        switch (key){
            case 1: readArray(); break;
            case 2: generateArray(); break;
            default:
                System.out.println("Несуществующий пункт меню"); menu();
        }
    }
    private static void readArray(){
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        String tmpString = in.nextLine();
        String[] stringArray = tmpString.split(" ");
        array = new double[stringArray.length];
        for (int i = 0; i < stringArray.length; i++)
            array[i] = Double.parseDouble(stringArray[i]);
        printArray();

    }

    private static void generateArray(){
        Random rand = new Random();
        System.out.println("Введите количество элементов массива:");
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int arrayLenght = in.nextInt();
        array = new double[arrayLenght];
        for (int i = 0; i < arrayLenght; i++)
            array[i] = rand.nextInt(200);
        printArray();
    }

    private static void printArray(){
        System.out.println(java.util.Arrays.toString(array));
    }

    private static double findMax(){
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length / 2; i++){
            double x = array[i] + array[array.length - 1 - i];
            max = (x > max)? x : max;
        }
        return max;
    }
}
