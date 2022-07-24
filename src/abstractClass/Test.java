/** ����������� ����� - �����, ������� �������� ������ ���������, ��-�� ������ ����������.
 *      1) ����� ��������� ������������� ������������� ������, ����� ���������� ����� �����-�� ����� ���������.
 *      2) �����(������) ��������� ����������� ������, ������� ������ ���� ����������� � �����������.
 *
 *  ��� ����������� ����� ���������� �� ����������?
 *      1) ��������� - ��� ��� ����� �����, � ����������� ����� - ��� ��, ��� ����� ��������.
 *      2) � ������������ ������ ����� ���� ������, ������� ��� ����������� - ����� ���������� ����� ��������� �
 *      �����������, � � ���������� - ����������� ������ static(private)-������.
 *      3) ���� ����� ����� ������������� ��������� �����������, �� ������������� ������ �� ������ ������.
 */


package abstractClass;

public class Test {

    public static void main(String[] args) {

    }
}

interface AbleToMotorStart{
    private void someMethod(){

    }
    public void motorStart();
}


abstract class Transport implements AbleToMotorStart{ // � �����, ����� ��������� ��������� � ����������� ������ �
            // ������������� ��� ������ � �����������
            // abstract �� ����� - ����� ������ ���� ��������� ������� - ������ ��� ������ ���������
    public void startMove(){   // ���� ����� �������� � ������� ����������
        System.out.println("�������� ��������!");
    }

    public abstract void move();  // ��� ����������� ����� - �� ������ ���� ���������� � ������� ����������
}


class Sheep extends Transport{

    @Override
    public void motorStart() {

    }

    @Override
    public void move() {
        System.out.println("������...");
    }
}

class Air extends Transport{

    @Override
    public void motorStart() {

    }

    @Override
    public void move() {
        System.out.println("�����...");
    }
}

class Car extends Transport{

    @Override
    public void motorStart() {

    }

    @Override
    public void move() {
        System.out.println("����...");
    }
}