
/** �������� ����� static
 *      1) ����������� � ���� � ������ - ������� � ���, ��� ��� ���� ������ (����������� ����);
 *      2) ����������� � ������ � ������ - ������� � ���, ��� ��� ����� ������ (����������� �����);
 *      3) ����������, ����� �� ������� ����������-��������� (� ��������� � final);
 *      4) ��������� ����� ������ � �����/������� ��� �������� �������;
 *
 *  � ��� ���� ����������� ����� -
 *      - ��� ����� ��� ���� �������� ������ (������ ��� ��� ���� ��������� � ������ ������, � �� ����������� �������);
 *      �� ���� ����� ����� ������ �������� ����������� ���� � ��� ���������� ��� ���� �������� ����� ������;
 *      - ��� ��-�������� ������ ������ ���������� ����� ����� (�� ����� �������� � ����� ������� - IDE ����� ������),
 *      ���� ����� �������� ����������� ���� �� �������� ������ (�� ������� ������)
 *
 *
 *  � ��� ���� ����������� ������� -
 *      - �� ����� �������� ����� �����, �.�. �� �������� ������ (�� ������� ������); <-- ��� �������.
 *      - � ��� ������ �������� ���� ������� (this �� �������� ������ ���); (������ ���� '����������� ��������' �� ����)
 *      - � ��� ����� �������� ����������� ���� (�.�. � ����������� ������� �� �������� � ����� �������, � �� ���������)
 *      - ��-�������� ������ ���������� ����� ����� (���� ����� � ����� ������ - �� IDE ��������)
 *      - �� ������ �������������� ��� ������������!
 * */


public class Statics {
    public static void main(String[] args) {
        Car car1 = new Car(1999, "Lada");
        System.out.println(Car.carsCount);
        car1.saySmth(); // ����� ������� - ����� ��� �� �������� static

        Car car2 = new Car(2003, "BMW");
        System.out.println(Car.carsCount); // ����������� ���� ���������

        Car.newMark("Nissan"); // ������� ����������� ����� ����� �����
    }
}


class Car{
    int createYear;
    String mark; // Lada, Lexus, BMW, Mercedes

    public static int carsCount;  // ����������� ����������
    public static int carsMark;


    public Car(int createYear, String mark){
        this.mark = mark;
        this.createYear = createYear;
        carsCount++;
    }

    public void saySmth(){               // ����, ������ �������� ������ ������� ����� �����, ��
                                        // ������ ������ ����� ������ - �����.
        System.out.println("Br-r-r");
    }

    public static void newMark(String newMarkName){  // ��� ����������� �����
        System.out.println("��������� ����� ����� ����� - "+newMarkName);
        carsMark++; // ����� �������� ����������� ����

    }
}