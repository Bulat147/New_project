package anonClass;

public class Test {
    // ���� ��� ����� ���� �������� �������������� �����-�� ������ ������ - ��� ����� �� ����� ��������� �����-�������,
        // ����� - ������� ��������� �����
    public static void main(String[] args) {
        ParentClass parent = new ParentClass(){  // ��� �� ������� �� ������ ������ ParentClass, � ��� ���������� ��� �����;
            @Override                              // �.�. ��������� �����
            public void printOut() {            // � �������������� ������ ��� �����
                System.out.println("Anon class...");
            }
        };


        // ����� �� ��������� ����� ��� ���������� ����������, � ������ ������������ ��������� �����...
        // ��� Upcasting:
        SomeInterface someInterface = new SomeInterface() { // ����� �� ������� �� ������ ������ SomeInterface (��� ������),
            @Override                                   // � ������ ����������� ������, ������������ ������ ���������
            public void wakeUp() {
                System.out.println("I wake up!");
            }
        };
    }


}

class ParentClass{
    public void printOut(){
        System.out.println("Hello, abstraction!");
    }
}

interface SomeInterface{
    public void wakeUp();
}
