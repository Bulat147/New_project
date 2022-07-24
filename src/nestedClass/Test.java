/** ��������� ������ - �� ����� 3 ����:
 *      1) ������������� ��������� � ����� ������ - ����� ������ � ����� ������� (� ������), ������� ������
 *      private (��� ������������ - ����� �� "���������" ������ ������������ ������); ������������, ����� ������������
 *      ������, ���� ������ ������ ������ ������� - �� ���� ���� �� ����� �������� �� ���������� ��������� ��������.
 *      ������ ������ ������������ ������ ����� ��������� ������� ����� ������ � �������� � ����.
 *
 *      2) ����������� ��������� � ����� ������ - �� ����� ������ � ����� ������� (������ ������), ������ public,
 *      �� ���� � ��� ����� �������� ������ �����. �� ���� ��� ������������ ������ ����� ������� ������� ����� ������
 *      � � ���� ��������.
 *
 *      3) ������ ��������� � ������ - ��� ����� ������ � final ����� ������.
 *
 *  � ����� - ��� �������� �� ������, ��� ������� ������� �� ������, ��� ������ �� �� �������
 */

package nestedClass;


import packaging.cars.SomeClass;

public class Test {

    public static void main(String[] args) {
        Electrocar myCar = new Electrocar(1);
        Electrocar.Buttery buttery = new Electrocar.Buttery(); // ��� ��������� ������� ��������� ����������� �������
        buttery.charging();

        myCar.start();
    }
}

class Electrocar{
    public int id;
    private final static int wheelsCount = 4;
    private final Motor motor;

    // 1) ������������� ��������� ����� - "��������� � �������", �����, ����� ������� ������ �� ��������� �����������
    private class Motor{ // ������ ������ ������������� ���� ����� - ��� ��������� ������� electrocar
        // ��� ���� ����� private, ����� ������������ � ��� �� �����, �� �� �� �����
        public void showModel(){
            System.out.println("Viper-X 3350 "+wheelsCount+" wheels"); // �� � ����������� ����� ���� ����� ������
        }
        public void startMotor(){
            System.out.println("Car"+id+" start motor:"); // ��� �� ����� ������������ ���� ������������ �������
            showModel();
        }
    }

    // 2) ����������� ��������� ����� - "�� ������ � ��������", �� �� ������ �������� ������ ������������� ��� ��������
    // "�� ������ � ��������" - ����� ���� ������� ������ � �������, ��� ��� ���������
    public static class Buttery{ // �� ����� ������� � ����� �������, ����� ������������ �� ��� ��������� ������
                                // �����(����) ������, ������ ������� ���������
        // ��� ���� ��������� public - ����� ������������ ��� �������� ���������, ���� ��� ����� ���� ������ �� �����
         public void charging(){
             System.out.println("������� ����������...");
         }
    }


    public Electrocar(int id){
        this.id = id;
        this.motor = new Motor();
    }

    public void start(){
        this.motor.startMotor();
        System.out.println("Electrocar "+ id+ " was started...");

        final int someInt = 5;

        class NewClass{
            public void someMethod(){
                System.out.println(id); // ����� ������ � ����� �������
                System.out.println(someInt); // ����� ������ � final ���������� ������
            }
        }

        NewClass someObject = new NewClass(); // � ��� ��� ����� ������ ����� �������������� - ����� ������������
                                                    // � ������ ������
        newMethod(someObject);

    }

    public void newMethod(Object obj){

    }

}