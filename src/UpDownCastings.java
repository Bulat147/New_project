public class UpDownCastings {

    public static void main(String[] args) {
        // Upcasting - ���������� �������������� (�� ������� ������� � ������� ������������� ��������)
        Dog myDog = new Dog();
        myDog.getString(); // ����� ������ � Dog
        Animal myAnimal = myDog; // ��� ����� ������ ������
        myAnimal.getCount(); // ����� ������ ������ � Animal, ���� ��� ������ ������ Dog

        // Downcasting - ���������� �������������� (������� ��������, ������ API - �� ���� ������������ ��, ��� ������)
            // - ��� ������������ �����
        Animal someAnimal = new Animal();
        Dog someDog = (Dog) someAnimal; // ������� ������ ��������������
        someDog.getCount();
        someDog.getString(); // ��� ����� ������ ������, ��� ������ ������ �� ����������, ���� IDE �� ������������
    }
}


class Animal{
    int getCount(){
       return 45;
    }
}

class Dog extends Animal{
    String getString(){
        return "Something";
    }
}