package polymorphism;

public class Dog extends Animal{
    int countDogs = 5;
    void bark(){
        System.out.println("Gaph-gaph!");
    }

    void what() {
        System.out.println("Dog, gaph-gaph");
    }
}
