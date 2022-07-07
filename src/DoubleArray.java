import java.util.Scanner;

// Кста, константы нужно именовать так MY_NEW_CONSTANT, а переменные myNewVariable
// А и ещё - в Java нельзя именовать пременные кратко - типа question, а не qst, типа string, а не str!!!

public class DoubleArray {

    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        // массив в массиве - матрица
        int[][] myIntArray = {{1, 2, 3},   // А вот так создаются массивы с массивами разных размеров внутри
                            {2, 3, 4, 8, 9},
                                        {0}};
        System.out.println(myIntArray[1][3]);

        String[][] myStr = new String[2][4]; // а так с одинаковыми размерами внутри
        myStr[1][2] = "Че там";
        System.out.println(myStr[0][0]);
    }
}
