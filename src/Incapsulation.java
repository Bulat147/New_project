/** ������������ � JAVA ����� �����
 *
 * � JAVA ������������ ����������� 2 ��������:
 *
 *      1) ����������� private �� ���� ������, ����� user �� ��� �� ��������� ����� �����
 *
 *      2) setter/getter - ������, (�) ����� ������������ ��� ������� ������ � ���� ������,
 *      �� ����� ������(���� user ������ ���-�� �� �� - �� ������������ ��� if-���/� ����� ���� Exception-���),
 *      � (�) ����� ������������ ���������� ������ ���, ����� �� �������� ������� ��� ��������, � ����� ��
 *      ������ ������������ �������� ������ ����� ���� ��� ��� �����-�� "������������" user.
 *
 *
 * */

public class Incapsulation {
    public static void main(String [] args){ /* ����, ������ ����� ���������� �������� args ���������� - �����
                                                ��������� ����� �� cmd � ������-�� ������������ �����������,
                                                �������, ��� �� ������ � CS50 ��� ������� ���� �� C.
                                             */

        Person chel1 = new Person();
        chel1.setAge(15); // ������ �� ����� ���������� ������� ������ ���, ����
        chel1.setName("Maxim");
        System.out.println(chel1.getName()+" "+chel1.getAge());

        System.out.println();

        Person chel2 = new Person();
        chel2.setName("���������");
        chel2.setAge(-1);
        System.out.println(chel2.getName()+" "+chel2.getAge());
    }


}

class Person{
    private String name;
    private int age;  // ������ ��� ���� �������� ������ ������ ������, � ����������� ���� �� ��������
    // TODO: ��������� ��� ��� � �����������(�� ��� ������������ ������� - � ��� �� �������) - DONE ( � ����������� ����� �� ��������! )

    /** ������ ����� ��������-�������� */

    public void setName(String userName){ /* ������ ��� �� ����� public ���� ���� ���������, ��� �� ��� �����
                                               �������� ��� user-� ����� � �����, ���� �� ����� �������� */
        if (!userName.isEmpty()){ // ��� � C++ Java ������� ������ � ���������� ���������� ��� if, ��� � ��� ! �����
            name = userName;
        }
        else{
            System.out.println("��� �� ������ ���� ������!");
        }
    }

    public String getName(){ // getter/setter ������ ������� ���, ��� ������� get/set � ����� � ������� ������ ��� var
        return name;
    }

    public void setAge(int userAge){
        if (userAge >= 0){
            age = userAge;
        }
        else {
            System.out.println("�� �� ����� �� ������� ���� �������������!");
        }
    }

    public int getAge(){
        return age;
    }

    /** ����� ����� ��������-�������� */ // ��� ��� ����� �������� ������������ ����? (����, ����� ����...)


    void speak(){ // ��������, ���� �� ��������� ����� �������, �� �� ��������� - public
        System.out.println("������, � "+name+" � ��� "+age); // ����� ��� ������ ����� ������ � ������ ������ � age<0 !
    }

    void toPension(){ // ��� ������������ ����� ����� ������ > 65 !
        System.out.println("�� ������ �������� "+(65-age));
    }

    String myWorkList(String[] professions, int workStage){
        String preString = "��� ���� "+workStage+", � �������: ";
        StringBuilder toReturn = new StringBuilder(); /* ��������� ����� �� ����� �������, ����� ����, ��� ����
                                                    � ������� ���� ��� � �� ���������� ������ - �� ��� � ���
                                                    ������� ���������� */
        toReturn.append(preString);
        for(String iterString: professions){ /* ������, � Java ������ ��������������� ������ � �����
                                                ��� ������� ���� �������� ���������� StringBuilder */
            toReturn.append(iterString);
        }
        // ���������, ��� IDE ���������� ��� ���������� ���������� (����� ������ ���������� finishReturn)
        return toReturn.toString(); // �� ����� � ����� ��� �������������� StringBuilder � String
    }
}