package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson1 {
    private static final String FILE_PATH = "Files" + File.separator + "text";
    public static void main(String[] args) throws FileNotFoundException{ // ��� �������������� ���������� ������� � ���,
                                                                        // ��� ����� ����� ��������� ����� ������
        methodOne(); // ���� ������ ������� � ���� ������ �� 1 �������, �� � ����������� ����� ���������� � � ������ ������(main)
    }               // �� ���� 2 ��������, �� ��� �� ����� ����� � ������������, �.�. ��� ��� ���������� ������ ����� ������

    public static void methodOne() throws FileNotFoundException { // ��� ������ ������ ������� ������ ��� Scanner
        File file = new File(FILE_PATH); // ��� ��������� ����� �� ������-�� �����
        Scanner scanner = new Scanner(file); // ���� ����������� �����, � �� ����
        scanner.close();
    }

    public static void methodTwo(){  // � ��� ������ ������ ������� ������ - ����� try/catch
        File file = new File(FILE_PATH);
        try{
            Scanner scanner = new Scanner(file);
            System.out.println("������ ������"); // ���� ��� �������� scanner ������� ������, �� ���� ���� �� ����������
            scanner.close();
        }catch (FileNotFoundException except){  // except - ��� ������ ������ ...Exception - �� ����������
            System.out.println("��-�� ���� �� �����");
        }
        System.out.println("� ��� ����� ����� ���������"); // ��� ����� try/catch ��������� ����������� �����������

    }
}
