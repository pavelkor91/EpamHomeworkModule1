package main.java.task5;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matrix {
    private static short matrix[][];

    public static void main(String[] args) {
        createMatrix();
        printMatrix();

    }

    private static void createMatrix(){
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите размер матрицы: ");
        int matrixLenght = in.nextInt();
        matrix = new short[matrixLenght][matrixLenght];
        for(int i = 0; i < matrixLenght; i++)
            for(int j = 0; j < matrixLenght; j++){
                if ((j == i) || i == matrixLenght - 1 - j){
                    matrix[i][j] = 1;
                }
                else
                    matrix[i][j] = 0;
            }
    }

    private static void printMatrix(){

        for (short tmp[] : matrix){
            System.out.println(Arrays.toString(tmp));
        }
    }

}
