package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TryWithResources {

    public static void main(String[] args) {
        // Так реализуется 'trying with resources' (контекстный менеджер) - нужно создавать объект oos !!!
        // Контекстный менеджер нужен, чтобы мы не забывали закрывать потоки.
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(UserFirst.PATH4))){
            UserFirst newUser = new UserFirst(1, "Mike");
            oos.writeObject(newUser);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
