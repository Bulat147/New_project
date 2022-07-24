/** В этом примере для записи в файл используется PrintWriter из java.io
 */

package writeToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {

    public static void main(String[] args) {
        String path = "src"+File.separator+"writeToFile"+File.separator+"newFile";
        File file = new File(path);

        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("Row 1"); // это запись в файл; так можно записывать в файл только текст(не байты);
            pw.println("Row 2");
            pw.close(); // обязательно нужно закрывать
        }catch(FileNotFoundException except){
            System.out.println("Эй, такого файла нет!");
        }
    }
}
