/** Вложенные классы - их всего 3 вида:
 *      1) нестатические вложенные в класс классы - имеют доступ к полям объекта (и класса), поэтому обычно
 *      private (для инкапсуляции - чтобы не "предавать" объект обрамляющего класса); используются, чтобы разграничить
 *      логику, если объект класса сложно устроен - то есть если он может состоять из нескольких вложенных объектов.
 *      Только внутри обрамляющего класса можно создавать объекты этого класса и работать с ними.
 *
 *      2) статические вложенные в класс классы - не имеют доступ к полям объекта (только класса), обычно public,
 *      то есть к ним можно получить доступ извне. То есть вне обрамляющего класса можно создать объекты этого класса
 *      и с ними работать.
 *
 *      3) классы вложенные в методы - они имеют доступ к final полям метода.
 *
 *  В общем - все основано на логике, что сложное состоит из частей, так почему бы не разбить
 */

package nestedClass;


import packaging.cars.SomeClass;

public class Test {

    public static void main(String[] args) {
        Electrocar myCar = new Electrocar(1);
        Electrocar.Buttery buttery = new Electrocar.Buttery(); // Так создаются объекты вложенных статических классов
        buttery.charging();

        myCar.start();
    }
}

class Electrocar{
    public int id;
    private final static int wheelsCount = 4;
    private final Motor motor;

    // 1) нестатический вложенный класс - "относится к объекту", нужен, чтобы разбить объект на несколько подобъектов
    private class Motor{ // внутри каждой электромашины есть мотор - это подобъект объекта electrocar
        // при этом мотор private, чтобы пользователь в нем не лазал, он же не профи
        public void showModel(){
            System.out.println("Viper-X 3350 "+wheelsCount+" wheels"); // ну к статическим полям тоже имеет доступ
        }
        public void startMotor(){
            System.out.println("Car"+id+" start motor:"); // вот он может использовать поля обрамляющего объекта
            showModel();
        }
    }

    // 2) Статический вложенный класс - "не связан с объектом", но мы просто согласно логике сгруппировали так вложенно
    // "не связан с объектом" - мотор куда сильнее связан с машиной, чем его батарейка
    public static class Buttery{ // не имеет доступа к полям объекта, чтобы пользователь не мог повредить другие
                                // части(поля) машины, просто заменяя батарейку
        // при этом батарейка public - чтобы пользователь мог заменить батарейку, ведь для этого проф навыки не нужны
         public void charging(){
             System.out.println("Батарея заряжается...");
         }
    }


    public Electrocar(int id){
        this.id = id;
        this.motor = new Motor();
    }

    public void start(){
        this.motor.startMotor();
        System.out.println("Electrocar "+ id+ " was started...");

        final int someInt = 5;

        class NewClass{
            public void someMethod(){
                System.out.println(id); // имеет доступ к полям объекта
                System.out.println(someInt); // имеет доступ к final переменным метода
            }
        }

        NewClass someObject = new NewClass(); // а вот так такие классы могут использоваться - чтобы передаваться
                                                    // в другие методы
        newMethod(someObject);

    }

    public void newMethod(Object obj){

    }

}