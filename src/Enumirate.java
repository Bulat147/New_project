import java.rmi.MarshalException;
import java.util.Arrays;

/** enum - это специальный кастомный класс, реализующий перечисление,
 *      1) Его стали использовать, чтобы ограничить возможность добавлять в перечисление лишние объекты.
 *          Например, чтобы создавая класс, который реализует дни недели, мы не могли добавить в его объекты
 *          лишние, не относящиеся к теме объекты. (https://javarush.ru/groups/posts/1963-kak-ispoljhzovatjh-klass-enum)
 *         P.S. То есть enum нужен для создания ограниченного круга значений.
 *
 *      2) Объекты перечисления, а точнее КОНСТАНТЫ, создаются внутри enum, а не снаружи. И они пишутся капсом!
 *      С помощью статических методов и, внимание, приватного конструктора можно работать с этими константами как с объектами.
 *      И они передаются вовне как статические поля!
 *
 *      3) Обрабатывать перечисление enum очень удобно со switch.
 *
 *      4) Хоть enum и класс, но от него нельзя наследоваться
 *
 * */

public class Enumirate {

    public static void main(String[] args) {
        // Получение объекта enum
        Months month = Months.MARCH;

        System.out.println(month instanceof Months); // Проверка на то, что Months.MARCH - это объект класса Months
        System.out.println(month.getClass()); // а это способ определить класс у данного объекта
        System.out.println(month.name()); // а это мы получаем программное имя объекта-константы

        switch (month){
            case APRIL: // интересный синтаксис, что двоеточие
                System.out.println("Апрель, есть апрель");
                break; // Чтобы другие case не выполнялись
            case JULY:
                System.out.println("Круто, Июль");
                break;
            default: // А это если все остальное
                System.out.println("Обычные месяцы - "+month);
                break;
        }

        // статический метод values() возвращает МАССИВ всех констант перечисления
        System.out.println(Arrays.toString(Months.values()));

        // получение порядкового номера константы ordinal() - по порядку объявления
        System.out.println(month.ordinal());

        // Второй способ получения объекта enum с соответствующим именем
        Months newMonth = Months.valueOf("MAY");
        System.out.println(newMonth);
    }
}

/** Иерархия наследования Object -> Enum -> Months */
enum Months{
    // Это константы (но по сути ОБЪЕКТЫ класса Months)
    JANUARY("Январь"), FEBRUARY("Февраль"), MARCH("Март"), APRIL("Апрель"), MAY("Май"),
    JUNE("Июнь"), JULY("Июль"), AUGUST("Август"), SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"), NOVEMBER("Ноябрь");
    private String translation; // это НЕСТАТИЧЕСКОЕ поле, относящееся к каждому из 12 объектов класса Months
    Months(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}