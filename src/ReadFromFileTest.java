import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFileTest {

    public static void main(String[] args) throws FileNotFoundException { // Обработали ошибку не найденного файла
        String separate = File.separator;
        String path = separate+"Users"+separate+"ninza"+separate+"IdeaProjects"+separate+"New_project"+separate+"Files"+separate+"numbers";
        File toRead = new File(path); // почему-то для File в пути не нужно указывать расширение файла

        Scanner scanner = new Scanner(toRead); // Если это написано, то нужно обработать FileNotException - иначе не работает!
        List<Integer> numbers = new ArrayList<>();
        while(scanner.hasNextLine()){
            String tempString = scanner.nextLine();
            String[] stringNumbers = tempString.split(" ");
            for(String inString: stringNumbers){
                numbers.add(Integer.parseInt(inString));
            }
        }
        scanner.close();
        // На numbers не нужно использовать Arrays.toString(numbers), тк Integer уже имеет метод toString();
        System.out.println(numbers);
    }
}
