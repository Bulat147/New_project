package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class ThrowingExceptions {
    public static void main(String[] args) throws MyOwnException {
        Scanner scanner = new Scanner(System.in); // Кстати, в скобках - константа
        while(true){
            String tempString = scanner.nextLine();
            if(Integer.parseInt(tempString) > 0) {
                try{                            // после try/catch блок кода продолжит выполняться, бесконечный цикл продолжится
                    throw new IOException();
                }catch(IOException exception){
                    System.out.println("Тут поймали IOException");
                }
            }
            if(Integer.parseInt(tempString) < 0){
                throw new MyOwnException();
            }
        }
    }
}

class MyOwnException extends Exception{
    public MyOwnException(){
        super("Это вот мое собственно разработанное исключение..."); // Видимо, если писать просто super(), то мы вызываем
                                                                    // метод-конструктор объекта класса-родителя
    }
}


class Animal{
    public void eat(){
        System.out.println("...");
    }
}

class Dog extends Animal{
    public void eat(){
        super.eat();  // а так вызываем любой метод у объекта класса-родителя
    }
}