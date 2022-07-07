import static java.lang.String.format;

public class StartOOP {

    public static void main(String [] args){
        Man chelovek1 = new Man(); // так как мы не определили конструктор, то в скобки сюда ниче вставлять не нужно
                                    // а ещё без конструктора нам придется явно доставать все поля и давать им значения...
        chelovek1.age = 15;
        System.out.printf("%s - %d - %s%n", chelovek1.name, chelovek1.age, chelovek1.prof); // %s - string, %d - число,
                                                                                            // %n - перенос строки
        System.out.print("Надеюсь это предложени на новой строке..."); // Блин русский не читается :(
        // Решил проблему так - File - Settings - Editor - File Encodings: Global Encoding - windows1251,
                                                                        // Project Encoding - windows1251;
    }
}


class Man{
    int age; // не иниц == 0
    int prof; // не иниц == 0
    String name; // не иниц == null

    public String whatIsYourProfession(){  // static-методы - это похоже методы из ФП, то есть это как
                                           // в Python ф-ции без self внутри класса(статические ф-ции) - помощники
                                           // поэтому static закрывает методу доступ к полям класса
        if (prof == 1){
            return "Директор";  // ничесе, Java контролит двойные кавычки - она одинарные не любит!
        }
        else{
            return "Наемник";
        }
    }
}