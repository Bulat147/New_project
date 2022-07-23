/** ��������� �������� � Java:
 *      1) ����������� ���� ������������ �� �����, �� ���� ������������ �� ��������.
 *      2) � ��������� ����� ������������ �� ������(����������) - ������ � ������. ��� �������� ����� equals � Object.
 *         ����� ��� ��������� ����� ������ �������������� ����� equals, ����� �� ��������� �� ������ ��� ������.
 *      3) ��������� == ���������� ������ ������ ������! ���� ���� �� �������������� equals !!!
 *
 *      4) ������� ������� - ����� ����������� ��������� ���� - ��������� ����� equals();
 *
 *  String Pool - ��� �������� Java �������� ���� ����� ������ ������� ���� � ������ (���� ���� ��������� ����������)
 *      ���������� ������� - ������ ���� ��� ��������� ����� ��������� ����� equals();
 */


public class EqualsStringPool {

    public static void main(String[] args) {
        MyOwnClass object1 = new MyOwnClass(1);
        MyOwnClass object2 = new MyOwnClass(1);
        System.out.println(object1.equals(object2)); // ����� �� �� ����� ������������ == �� ����� ������ �� ������� ����������

        // ��� String Pool
        String string1 = "Hello";
        String string2 = "Hello"; // string2 ����� ��������� �� ��� �� ������, ��� � string1

        System.out.println(string1 == string2); // ������� true ��-�� String Pool, �� ��� ��������� �� ���� � ��� �� ������
        System.out.println(string1.equals(string2)); // ������� true, �� ��� ��-�� ����������� ������������, � �� ��������
    }
}


class MyOwnClass{
    private int id;

    public MyOwnClass(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {  // ����� - ������ ��� � ���������� ������������ ��� ������������ ������,
                                            // ����� �������������� ��������� ������ ����������� �����.
        // ������ DownCasting, ����� � object ���� ���� id:
        MyOwnClass other = (MyOwnClass) object;
        return (this.id == other.id);
    }
}
