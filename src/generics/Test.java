/** Generics
 *      - В них нельзя использовать примитивные типы: Link<int> myList - так нельзя
 *
 */


package generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // List - это интерфейс, а ArrayList - один из путей его реализации
        List<Integer> myList = new ArrayList<>(); // Так мы показываем, что в списке могут содержаться только Integer-объекты
        myList.add(456);
        int myInt = myList.get(0);
    }

    // Здесь демонстрируется работа с "wildcards"
    public static void loopAroundList(List<? extends Animal> inputList){ // Animal и все его наследники (но внутри этого
                                                                         // метода могут вызываться только методы Animal)
        for(Animal subject: inputList){                         // <?> - это Object и его наследники, т.е любые объекты
            subject.eat();                                      // <? super Animal> - это Animal и все его родители, вкл Object
        }
    }

}

class Animal{
    int id;

    public Animal(int id){ // Если есть в родителе конструктор с входными элементами, то они должны
        this.id = id;       // передаваться и в конструкторах классов-наследников
    }

    public void eat(){
        System.out.println("Eating...");
    }
}

// видимо super - это обращение к объекту класса-родителя
class Cat extends Animal{  // Дефолтный конструктор Cat вызывает дефолтный конструктор Animal, которого уже нет
    public Cat(int id){           // ведь вместо него новый конструктор с входными данными, поэтому в Cat нужен конструктор,
        super(id);        // который вызывает новый конструктор Animal и передает туда нужные значения
    }

    public void meow(){
        System.out.println("Meow-meow!");
    }
}