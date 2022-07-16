package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson1 {
    private static final String FILE_PATH = "Files" + File.separator + "text";
    public static void main(String[] args) throws FileNotFoundException{ // это предупреждение вызывающим методам о том,
                                                                        // что метод может выбросить такую ошибку
        methodOne(); // если ошибка ловится в этом методе по 1 способу, то её обязательно нужно обработать и в данном методе(main)
    }               // но если 2 способом, то уже не нужно здесь её обрабатывать, т.к. она уже обработана внутри этого метода

    public static void methodOne() throws FileNotFoundException { // Это первый способ поймать ошибку при Scanner
        File file = new File(FILE_PATH); // Тут создается ПОТОК из какого-то файла
        Scanner scanner = new Scanner(file); // Сюда вставляется ПОТОК, а не путь
        scanner.close();
    }

    public static void methodTwo(){  // А это второй способ поймать ошибку - через try/catch
        File file = new File(FILE_PATH);
        try{
            Scanner scanner = new Scanner(file);
            System.out.println("Сканер прошел"); // Если при создании scanner выпадет ошибка, то этот блок не выполнится
            scanner.close();
        }catch (FileNotFoundException except){  // except - это объект класса ...Exception - он обязателен
            System.out.println("Че-то файл не найти");
        }
        System.out.println("А это текст после обработки"); // Код после try/catch продолжит выполняться обязательно

    }
}
