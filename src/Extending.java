/** ������������ � JAVA
 *      - ����������� ����� 'MyClass extends ParentClass'
 *      - private ������ � ���� �������� �� �������� � ����������, ��...
 *      - ��������� ����� �������� ������ � private-����� �������� ����� getter/setter-������
 *      - ����� �������������� ����� ��������, � ���������� ����� � �������� ��������� ���������,
 *      ���� ��������� ����� ������ - �� ��� ����� ����������, � �� ���������������
 * */


public class Extending {    // � ������ ����� ���� ������ ���� public - �����, ������� �������� � ��������� ������� src

    public static void main(String[] args) {
        BpLA myBp = new BpLA();
        String newString = myBp.getSomething();  // � ��������� ����� �������� ����� �������� ������ ����� �������/�������
        myBp.printType(); // ����� ����������
        myBp.printType("Kukumber"); // ���������� ������ ����������
    }
}

class FlyingStuff{
    int count = 40;
    private String something = "Nothing";

    public String getSomething(){
        return something;
    }

    public void setSomething(String str){
        this.something = str;
    }

    private void startFly(){
        System.out.println("R-r-r-r-r");
    }

    public void printType(){
        System.out.println("Flyer");
    }
}

class BpLA extends FlyingStuff{

    public void printType(String someStr){
        System.out.println("Peregruzka "+someStr);
    }

}

