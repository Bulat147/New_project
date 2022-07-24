package serialization;

import java.io.*;

/** Очень важный момент - чтобы объект можно было сериализовать, нужно чтобы
 *  его класс реализовывал интерфейс Serializable !!! */
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
            /** FileOutputStream более абстрактен - он работает просто с записью байт в файл
             *  ObjectOutputStream конкретен - он переводит в байты объекты, но для записи их в файл необходим fos-объект
             *  (А так есть ещё классы для перевода в байты звука, картинок и тд - не только объектов)
             */
            FileOutputStream fos = new FileOutputStream(UserFirst.PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Записываем в файл 2 объекта
            oos.writeObject(user1);
            oos.writeObject(user2);

            oos.close();
        } catch (IOException e) {
            /* Чтоб обработать обязательные исключения при fos и oos, достаточно обработать
                родительское исключение - IOException */
            throw new RuntimeException(e);
        }
    }
}

class ToReadObject{
    public static void main(String[] args) {  // в одном проекте может быть много main-методов, тк
                                                // может быть много точек входа в программу
        try {
            FileInputStream fis = new FileInputStream(UserFirst.PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Считываем объекты, при этом readObject возвращает объект типа Object, поэтому
            // чтобы нормально считать объекты нужно применить DownCasting:
            UserFirst user1 = (UserFirst) ois.readObject();
            UserFirst user2 = (UserFirst) ois.readObject();
            // Внутри файла видимо есть какой-то разделитель на объекты

            ois.close();
            System.out.println(user1);
            System.out.println(user2);

        } catch (IOException | ClassNotFoundException e) {
            // ClassNotFoundException обязателен для обработки при .readObject();
            throw new RuntimeException(e);
        }
    }

}