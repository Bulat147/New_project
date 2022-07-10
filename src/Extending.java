/** Наследование в JAVA
 *      - Реализуется через 'MyClass extends ParentClass'
 *      - private методы и поля родителя не доступны в наследнике, НО...
 *      - наследник может получить доступ к private-полям родителя через getter/setter-методы
 *      - Чтобы переопределить метод родителя, в наследнике нужно в точности повторить сигнатуру,
 *      если аргументы будут разные - то это будет перегрузка, а не переопределение
 * */


public class Extending {    // В модуле может быть только один public - класс, который доступен в остальных модулях src

    public static void main(String[] args) {
        BpLA myBp = new BpLA();
        String newString = myBp.getSomething();  // К приватным полям родителя можно получить доступ через геттеры/сеттеры
        myBp.printType(); // метод наследника
        myBp.printType("Kukumber"); // перегрузка метода наследника
    }
}

class FlyingStuff{
    int count = 40;
    private String something = "Nothing";

    public String getSomething(){
        return something;
    }

    public void setSomething(String str){
        this.something = str;
    }

    private void startFly(){
        System.out.println("R-r-r-r-r");
    }

    public void printType(){
        System.out.println("Flyer");
    }
}

class BpLA extends FlyingStuff{

    public void printType(String someStr){
        System.out.println("Peregruzka "+someStr);
    }

}

