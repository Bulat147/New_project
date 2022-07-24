package serialization;

import java.io.*;

/** ����� ������ ������ - ����� ������ ����� ���� �������������, ����� �����
 *  ��� ����� ������������ ��������� Serializable !!! */
public class UserFirst implements Serializable{
    public static final String PATH = "src"+ File.separator+"serialization"+File.separator+"file1";
    public int id;
    public String login;

    public UserFirst(int id, String login){
        this.id = id;
        this.login = login;
    }

    @Override
    public String toString() {
        return id+" "+login;
    }
}

class ToWriteObject{
    public static void main(String[] args) {
        UserFirst user1 = new UserFirst(1, "marking");
        UserFirst user2 = new UserFirst(2, "djeday");

        try {
            /** FileOutputStream ����� ���������� - �� �������� ������ � ������� ���� � ����
             *  ObjectOutputStream ��������� - �� ��������� � ����� �������, �� ��� ������ �� � ���� ��������� fos-������
             *  (� ��� ���� ��� ������ ��� �������� � ����� �����, �������� � �� - �� ������ ��������)
             */
            FileOutputStream fos = new FileOutputStream(UserFirst.PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // ���������� � ���� 2 �������
            oos.writeObject(user1);
            oos.writeObject(user2);

            oos.close();
        } catch (IOException e) {
            /* ���� ���������� ������������ ���������� ��� fos � oos, ���������� ����������
                ������������ ���������� - IOException */
            throw new RuntimeException(e);
        }
    }
}

class ToReadObject{
    public static void main(String[] args) {  // � ����� ������� ����� ���� ����� main-�������, ��
                                                // ����� ���� ����� ����� ����� � ���������
        try {
            FileInputStream fis = new FileInputStream(UserFirst.PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // ��������� �������, ��� ���� readObject ���������� ������ ���� Object, �������
            // ����� ��������� ������� ������� ����� ��������� DownCasting:
            UserFirst user1 = (UserFirst) ois.readObject();
            UserFirst user2 = (UserFirst) ois.readObject();
            // ������ ����� ������ ���� �����-�� ����������� �� �������

            ois.close();
            System.out.println(user1);
            System.out.println(user2);

        } catch (IOException | ClassNotFoundException e) {
            // ClassNotFoundException ���������� ��� ��������� ��� .readObject();
            throw new RuntimeException(e);
        }
    }

}