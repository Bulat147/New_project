/** Generics
 *      - � ��� ������ ������������ ����������� ����: Link<int> myList - ��� ������
 *
 */


package generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // List - ��� ���������, � ArrayList - ���� �� ����� ��� ����������
        List<Integer> myList = new ArrayList<>(); // ��� �� ����������, ��� � ������ ����� ����������� ������ Integer-�������
        myList.add(456);
        int myInt = myList.get(0);
    }

    // ����� ��������������� ������ � "wildcards"
    public static void loopAroundList(List<? extends Animal> inputList){ // Animal � ��� ��� ���������� (�� ������ �����
                                                                         // ������ ����� ���������� ������ ������ Animal)
        for(Animal subject: inputList){                         // <?> - ��� Object � ��� ����������, �.� ����� �������
            subject.eat();                                      // <? super Animal> - ��� Animal � ��� ��� ��������, ��� Object
        }
    }

}

class Animal{
    int id;

    public Animal(int id){ // ���� ���� � �������� ����������� � �������� ����������, �� ��� ������
        this.id = id;       // ������������ � � ������������� �������-�����������
    }

    public void eat(){
        System.out.println("Eating...");
    }
}

// ������ super - ��� ��������� � ������� ������-��������
class Cat extends Animal{  // ��������� ����������� Cat �������� ��������� ����������� Animal, �������� ��� ���
    public Cat(int id){           // ���� ������ ���� ����� ����������� � �������� �������, ������� � Cat ����� �����������,
        super(id);        // ������� �������� ����� ����������� Animal � �������� ���� ������ ��������
    }

    public void meow(){
        System.out.println("Meow-meow!");
    }
}