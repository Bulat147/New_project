/** Два вида Exception-ов
 *      1) Checked(Compile time exceptions) - это просто исключительные моменты, которые обязательно НУЖНО ОБРАБАТЫВАТЬ,
 *         чтобы программа нормально работала
 *      2) Unchecked(Runtime exceptions) - это уже ошибки, по-хорошему их НЕ НУЖНО ОБРАБАТЫВАТЬ, нужно их просто
 *         не допускать, избавляться от них.
 *         Но, если уж нужно, их можно обрабатывать как исключения типа RuntimeException.
 */


package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwoExceptionsTypes {
    public static void main(String[] args) {
        String path = "Files"+File.separator+"text";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file); // Вот это Checked Exception
        } catch (FileNotFoundException e) {
            System.out.println("Обрабатываем checked exception");
        }

        float myFloat = 45/0; // Вот это уже ошибка, которой быть не должно - её не нужно обрабатывать, нужно удалять, НО...
        // Такое можно обработать:
        try {
            float myFloat2 = 54 / 0;
        }catch(RuntimeException exception){
            System.out.println("Обработали-таки Runtime, ох, сорванцы!");
        }
    }
}
