/** Сравнение объектов в Java:
 *      1) Примитивные типы сравниваются по факту, то есть сравниваются их значения.
 *      2) У ссылочных типов сравниваются их ссылки(переменные) - адреса в памяти. Так работает метод equals у Object.
 *         Чтобы это исправить нужно просто переопределить метод equals, чтобы он сравнивал по нужной нам логике.
 *      3) Выражение == сравнивает всегда ТОЛЬКО ссылки! Даже если мы переопределили equals !!!
 *
 *      4) Главное правило - когда сравниваешь ссылочные типы - ИСПОЛЬЗУЙ МЕТОД equals();
 *
 *  String Pool - это механизм Java создания лишь одной строки данного вида в памяти (даже если несколько переменных)
 *      Истекающее правило - всегда даже при сравнении строк используй метод equals();
 */


public class EqualsStringPool {

    public static void main(String[] args) {
        MyOwnClass object1 = new MyOwnClass(1);
        MyOwnClass object2 = new MyOwnClass(1);
        System.out.println(object1.equals(object2)); // Здесь мы не можем использовать == он будет просто по адресам сравнивать

        // Про String Pool
        String string1 = "Hello";
        String string2 = "Hello"; // string2 будет указывать на ТОТ ЖЕ ОБЪЕКТ, что и string1

        System.out.println(string1 == string2); // покажет true из-за String Pool, тк оба ссылаются на один и тот же объект
        System.out.println(string1.equals(string2)); // покажет true, но уже из-за структурной идентичности, а не адресной
    }
}


class MyOwnClass{
    private int id;

    public MyOwnClass(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {  // Важно - нельзя тут в аргументах использовать нзв собственного класса,
                                            // Чтобы переопределить сигнатура должна повторяться точно.
        // Делаем DownCasting, чтобы у object было поле id:
        MyOwnClass other = (MyOwnClass) object;
        return (this.id == other.id);
    }
}
