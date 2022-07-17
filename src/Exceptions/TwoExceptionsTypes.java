/** ��� ���� Exception-��
 *      1) Checked(Compile time exceptions) - ��� ������ �������������� �������, ������� ����������� ����� ������������,
 *         ����� ��������� ��������� ��������
 *      2) Unchecked(Runtime exceptions) - ��� ��� ������, ��-�������� �� �� ����� ������������, ����� �� ������
 *         �� ���������, ����������� �� ���.
 *         ��, ���� �� �����, �� ����� ������������ ��� ���������� ���� RuntimeException.
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
            Scanner scanner = new Scanner(file); // ��� ��� Checked Exception
        } catch (FileNotFoundException e) {
            System.out.println("������������ checked exception");
        }

        float myFloat = 45/0; // ��� ��� ��� ������, ������� ���� �� ������ - � �� ����� ������������, ����� �������, ��...
        // ����� ����� ����������:
        try {
            float myFloat2 = 54 / 0;
        }catch(RuntimeException exception){
            System.out.println("����������-���� Runtime, ��, ��������!");
        }
    }
}
