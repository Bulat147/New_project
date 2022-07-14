package polymorphism;

public class Animal {
    int year = 1999;

    void speak(){  // default-метод не статический
        System.out.println("Animal is speak something");
    }

    void what(){
        System.out.println("Nothing");
    }
}
