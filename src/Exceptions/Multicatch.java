package Exceptions;

import java.io.IOException;

public class Multicatch {
    public static void main(String[] args) throws AbstractMethodError, IOException{
        methodOne(); // ��� ����� �������� ������ exception-� � ���������

        // � � ����� ������ �� ���������� ����������
        try {
            methodTwo();
        }catch(ReflectiveOperationException | TypeNotPresentException e){  // ��� multicatch - ���� ������ ���� �����
                                                                            // ���������� ���������
        }catch(SecurityException ex){  // ��� ��������, ���� ����� ������ ��������� ���������� ��-�������

        }catch (Exception exc){

        }
    }

    public static void methodOne() throws AbstractMethodError, IOException {}
    public static void methodTwo() throws ReflectiveOperationException, TypeNotPresentException, SecurityException{}
}
