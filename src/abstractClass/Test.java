/** Абстрактный класс - класс, объекты которого нельзя создавать, яв-ся просто КОНЦЕПЦИЕЙ.
 *      1) Может содержать реализованные неабстрактные методы, чтобы наследники имели какое-то общее поведение.
 *      2) Может(должен) содержать абстрактные методы, которые должны быть реализованы в наследниках.
 *
 *  Чем абстрактный класс отличается от интерфейса?
 *      1) Интерфейс - это что класс может, а абстрактный класс - это то, чем класс является.
 *      2) У абстрактного класса могут быть методы, которые уже реализованы - чтобы обозначить общее поведение у
 *      наследников, а в интерфейсе - реализуются только static(private)-методы.
 *      3) Один класс может реализовывать несколько интерфейсов, но наследоваться только от одного класса.
 */


package abstractClass;

public class Test {

    public static void main(String[] args) {

    }
}

interface AbleToMotorStart{
    private void someMethod(){

    }
    public void motorStart();
}


abstract class Transport implements AbleToMotorStart{ // О круто, можно указывать интерфейс в абстрактном классе и
            // реализовывать его только в наследниках
            // abstract мы пишем - чтобы нельзя было создавать объекты - теперь это просто КОНЦЕПЦИЯ
    public void startMove(){   // Этот метод доступен у каждого наследника
        System.out.println("Начинаем движение!");
    }

    public abstract void move();  // это абстрактный метод - он обязан быть реализован у каждого наследника
}


class Sheep extends Transport{

    @Override
    public void motorStart() {

    }

    @Override
    public void move() {
        System.out.println("Плывет...");
    }
}

class Air extends Transport{

    @Override
    public void motorStart() {

    }

    @Override
    public void move() {
        System.out.println("Летит...");
    }
}

class Car extends Transport{

    @Override
    public void motorStart() {

    }

    @Override
    public void move() {
        System.out.println("Едет...");
    }
}