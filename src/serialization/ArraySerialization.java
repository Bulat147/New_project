package serialization;

import java.io.*;
import java.util.Arrays;

public class ArraySerialization {
}

class ArrayToWrite{

    public static void main(String[] args) {
        UserFirst[] users = {new UserFirst(1, "sara"), new UserFirst(2, "kiri"), new UserFirst(3, "max")};
        try {
            /** Первый способ сериализации массива - сохранение длины и поэлементная сериализация */
            FileOutputStream fos = new FileOutputStream(UserFirst.PATH2);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(users.length);
            for (UserFirst usr: users){
                oos.writeObject(usr);
            }
            oos.close();

            /** Второй способ сериализации - сохранение целого массива как объекта */
            FileOutputStream fos2 = new FileOutputStream(UserFirst.PATH3);
            ObjectOutputStream oos2 = new ObjectOutputStream(fos2);

            oos2.writeObject(users);
            oos2.close();

        }catch(IOException e){
            throw new RuntimeException(e);
        }


    }
}

class ArrayToRead{

    public static void main(String[] args) {
        try {
            /** Распаковка первого способа */
            FileInputStream fis = new FileInputStream(UserFirst.PATH2);
            ObjectInputStream ois = new ObjectInputStream(fis);

            int objectsCount = ois.readInt(); // Считали длину массива
            UserFirst[] inputUsers = new UserFirst[objectsCount];
            // Заполняем массив
            for (int i = 0; i < objectsCount; i++){
                inputUsers[i] = (UserFirst) ois.readObject(); // Нужен downCasting, ведь метод возвращает объект типа Object
            }
            System.out.println(Arrays.toString(inputUsers));
            ois.close();

            /** Распаковка второго способа */
            FileInputStream fis2 = new FileInputStream(UserFirst.PATH3);
            ObjectInputStream ois2 = new ObjectInputStream(fis2);

            // Видимо, UserFirst[] - это тоже наследник Object
            UserFirst[] users = (UserFirst[]) ois2.readObject();
            System.out.println(Arrays.toString(users));
            ois2.close(); // Кста, видимо, внутри в методе close у ois есть ещё метод close у fis,
            // поэтому мы его отдельно не прописываем

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}