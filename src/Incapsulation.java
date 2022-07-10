/** ИНКАПСУЛЯЦИЯ В JAVA ОЧЕНЬ ВАЖНА
 *
 * В JAVA инкапсуляция реализуется 2 приемами:
 *
 *      1) навешивание private на поля класса, чтобы user не мог их доставать через точку
 *
 *      2) setter/getter - методы, (а) чтобы пользователь мог вносить данные в поля класса,
 *      не ломая логику(если user вносит что-то не то - мы обрабатываем это if-ами/а может даже Exception-ами),
 *      и (б) чтобы пользователю выдавались данные так, чтобы не звякнуть лишнего или проверть, а может ли
 *      данный пользователь получить данные этого поля или это какой-то "неправильный" user.
 *
 *
 * */

public class Incapsulation {
    public static void main(String [] args){ /* Кста, видимо здесь стринговый параметр args обязателен - чтобы
                                                запускать прогу из cmd с какими-то изначальными параметрами,
                                                помнишь, как мы делали в CS50 при запуске кода на C.
                                             */

        Person chel1 = new Person();
        chel1.setAge(15); // Теперь мы можем передавать возраст только так, хаха
        chel1.setName("Maxim");
        System.out.println(chel1.getName()+" "+chel1.getAge());

        System.out.println();

        Person chel2 = new Person();
        chel2.setName("Кукарекур");
        chel2.setAge(-1);
        System.out.println(chel2.getName()+" "+chel2.getAge());
    }


}

class Person{
    private String name;
    private int age;  // теперь это поле доступно только внутри класса, у наследников тоже не доступно
    // TODO: Прочекать как там у наследников(см все модификаторы доступа - в чем их разница) - DONE ( у наследников будет не доступно! )

    /** НАЧАЛО блока геттеров-сеттеров */

    public void setName(String userName){ /* видимо тут мы пишем public чтоб прям намекнуть, что мы это хотим
                                               засунуть это user-у прямо в пасть, чтоб не хотел большего */
        if (!userName.isEmpty()){ // Как и C++ Java требует скобок в логических выражениях при if, ОПА а тут ! робит
            name = userName;
        }
        else{
            System.out.println("Имя не должно быть пустым!");
        }
    }

    public String getName(){ // getter/setter методы пишутся так, что сначала get/set а потом с большой первой нзв var
        return name;
    }

    public void setAge(int userAge){
        if (userAge >= 0){
            age = userAge;
        }
        else {
            System.out.println("Да не может же возраст быть отрицательным!");
        }
    }

    public int getAge(){
        return age;
    }

    /** КОНЕЦ блока геттеров-сеттеров */ // Как вам такая практика читабельного кода? (Нврн, фигня идея...)


    void speak(){ // возможно, если не указывать модиф доступа, то он автоматом - public
        System.out.println("Привет, я "+name+" и мне "+age); // здесь без инкапс может выдать с пустым именем и age<0 !
    }

    void toPension(){ // без инкапсуляции здесь может выдать > 65 !
        System.out.println("До пенсии осталось "+(65-age));
    }

    String myWorkList(String[] professions, int workStage){
        String preString = "Мой стаж "+workStage+", я работал: ";
        StringBuilder toReturn = new StringBuilder(); /* Отсутсвие парам по умолч полезно, сразу ясно, что если
                                                    в скобках ниче нет и не показывает ошибки - то там и нет
                                                    никаких параметров */
        toReturn.append(preString);
        for(String iterString: professions){ /* Ничесе, в Java НЕЛЬЗЯ конкатенировать строки В ЦИКЛЕ
                                                Для решения этой проблемы используют StringBuilder */
            toReturn.append(iterString);
        }
        // Прикольно, что IDE показывает нам избыточные переменные (Здесь удалил переменную finishReturn)
        return toReturn.toString(); // Но нужно в конце так конвертировать StringBuilder в String
    }
}