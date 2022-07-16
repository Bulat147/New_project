package anonClass;

public class Test {
    // Если нам нужно лишь единожды переопределить какие-то методы класса - для этого не нужно создавать класс-потомок,
        // лучше - создать анонимный класс
    public static void main(String[] args) {
        ParentClass parent = new ParentClass(){  // тут мы создали не объект класса ParentClass, а его наследника без имени;
            @Override                              // т.е. анонимный класс
            public void printOut() {            // и переопределили нужный нам метод
                System.out.println("Anon class...");
            }
        };


        // Можно не создавать класс для реализации интерфейса, а просто использовать анонимный класс...
        // Это Upcasting:
        SomeInterface someInterface = new SomeInterface() { // Здесь мы создаем не объект класса SomeInterface (так нельзя),
            @Override                                   // а объект безымянного класса, реализующего данный интерфейс
            public void wakeUp() {
                System.out.println("I wake up!");
            }
        };
    }


}

class ParentClass{
    public void printOut(){
        System.out.println("Hello, abstraction!");
    }
}

interface SomeInterface{
    public void wakeUp();
}
