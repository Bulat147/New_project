package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class ThrowingExceptions {
    public static void main(String[] args) throws MyOwnException {
        Scanner scanner = new Scanner(System.in); // ������, � ������� - ���������
        while(true){
            String tempString = scanner.nextLine();
            if(Integer.parseInt(tempString) > 0) {
                try{                            // ����� try/catch ���� ���� ��������� �����������, ����������� ���� �����������
                    throw new IOException();
                }catch(IOException exception){
                    System.out.println("��� ������� IOException");
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
        super("��� ��� ��� ���������� ������������� ����������..."); // ������, ���� ������ ������ super(), �� �� ��������
                                                                    // �����-����������� ������� ������-��������
    }
}


class Animal{
    public void eat(){
        System.out.println("...");
    }
}

class Dog extends Animal{
    public void eat(){
        super.eat();  // � ��� �������� ����� ����� � ������� ������-��������
    }
}