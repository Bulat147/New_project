import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFileTest {

    public static void main(String[] args) throws FileNotFoundException { // ���������� ������ �� ���������� �����
        String separate = File.separator;
        String path = separate+"Users"+separate+"ninza"+separate+"IdeaProjects"+separate+"New_project"+separate+"Files"+separate+"numbers";
        File toRead = new File(path); // ������-�� ��� File � ���� �� ����� ��������� ���������� �����

        Scanner scanner = new Scanner(toRead); // ���� ��� ��������, �� ����� ���������� FileNotException - ����� �� ��������!
        List<Integer> numbers = new ArrayList<>();
        while(scanner.hasNextLine()){
            String tempString = scanner.nextLine();
            String[] stringNumbers = tempString.split(" ");
            for(String inString: stringNumbers){
                numbers.add(Integer.parseInt(inString));
            }
        }
        scanner.close();
        // �� numbers �� ����� ������������ Arrays.toString(numbers), �� Integer ��� ����� ����� toString();
        System.out.println(numbers);
    }
}
