/**  �����������
 *     (�) ������� ������� - ��������� ���������� ������������ ������ ����� ���������, � �� ������� �������.
 *
 *     (�) ������� ���������� - ���� ��� ���������� - ��� �����-�������� ������ �������(�� ���������), ��
 *          (1) ����������� �� ���������������� ���������� �� ������-��������
 *          (2) � ����������� ���������������� ���������� (�.�. �� ��� � ����� ����������, �� � ������-����������)
 *
 *     (�) � JAVA ������ ��� ���������� �������� ������ �������-������
 */
package polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal concreteAnimal = new Dog(); // ���������� ��-�� ������ �������� ���� ����������, � �� ������ �������
        concreteAnimal.speak();
        int year = concreteAnimal.year; // ������� ����� ������ speak � year - ��� �������� Animal (�)

        Dog littleDog = new Dog(); // � ���� ������ �������� ��� �������� ��������� ���� Dog (�)
        littleDog.speak();
        System.out.println(littleDog.year); // � ��� � �������� �������� - Animal

        littleDog.bark();                   // � �������� ������ ������ Dog
        System.out.println(littleDog.countDogs);

        concreteAnimal.what(); // ����� ����������� ����� �� Dog, � �� Animal (�) - ������� ����������

        Cat bigCat = new Cat();
        Animal someAnimal = new Animal();

        System.out.println("������� ������������:");
        testLiskov(someAnimal);
        testLiskov(littleDog);
        testLiskov(bigCat);
    }

    // ��� � ��� ������� ������������ Java - ������������� ������ (�������-������???)
    public static void testLiskov(Animal animal){
        animal.what();
    }


}
