public class UpDownCastings {

    public static void main(String[] args) {
        // Upcasting - восход€щее преобразование (не создает проблем с логикой использовани€ объектов)
        Dog myDog = new Dog();
        myDog.getString(); // имеет методы у Dog
        Animal myAnimal = myDog; // Ёто можно делать Ќ≈я¬Ќќ
        myAnimal.getCount(); // имеет методы только у Animal, хот€ сам объект класса Dog

        // Downcasting - нисход€щее преобразование (создает проблемы, ломает API - не дает использовать то, что должно)
            // - Ё“ќ Ќ≈Ѕ≈«ќѕј—Ќјя Ў“” ј
        Animal someAnimal = new Animal();
        Dog someDog = (Dog) someAnimal; // “ребует я¬Ќќ√ќ преобразовани€
        someDog.getCount();
        someDog.getString(); // ¬от здесь выдаст ошибку, что такого метода не существует, хот€ IDE не подсвечивает
    }
}


class Animal{
    int getCount(){
       return 45;
    }
}

class Dog extends Animal{
    String getString(){
        return "Something";
    }
}