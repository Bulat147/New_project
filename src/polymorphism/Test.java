/**  Полиморфизм
 *     (А) Главное правило - доступный функционал определяется только ТИПОМ ПРЕМЕННОЙ, а не классом объекта.
 *
 *     (Б) Позднее связывание - если тип переменной - это класс-родитель класса объекта(он наследник), то
 *          (1) реализуется не переопределенный функционал из класса-родителя
 *          (2) и реализуется переопределенный функционал (т.е. то что с одной сигнатурой, но в классе-наследнике)
 *
 *     (В) В JAVA удобен для реализации принципа замены Барбары-Лисков
 */
package polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal concreteAnimal = new Dog(); // Доступными яв-ся только атрибуты типа переменной, а не класса объекта
        concreteAnimal.speak();
        int year = concreteAnimal.year; // Поэтому можно только speak и year - это атрибуты Animal (А)

        Dog littleDog = new Dog(); // в этом случае доступны все атрибуты доступные типу Dog (А)
        littleDog.speak();
        System.out.println(littleDog.year); // а это и атрибуты родителя - Animal

        littleDog.bark();                   // и атрибуты самого класса Dog
        System.out.println(littleDog.countDogs);

        concreteAnimal.what(); // Здесь реализуется метод из Dog, а не Animal (Б) - ПОЗДНЕЕ СВЯЗЫВАНИЕ

        Cat bigCat = new Cat();
        Animal someAnimal = new Animal();

        System.out.println("Красота полиморфизма:");
        testLiskov(someAnimal);
        testLiskov(littleDog);
        testLiskov(bigCat);
    }

    // Вот в чем красота полиморфизма Java - универсальные методы (Барбара-Лисков???)
    public static void testLiskov(Animal animal){
        animal.what();
    }


}
