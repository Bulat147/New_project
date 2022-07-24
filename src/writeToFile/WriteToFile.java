/** � ���� ������� ��� ������ � ���� ������������ PrintWriter �� java.io
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
            pw.println("Row 1"); // ��� ������ � ����; ��� ����� ���������� � ���� ������ �����(�� �����);
            pw.println("Row 2");
            pw.close(); // ����������� ����� ���������
        }catch(FileNotFoundException except){
            System.out.println("��, ������ ����� ���!");
        }
    }
}
