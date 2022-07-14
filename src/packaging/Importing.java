package packaging;
import packaging.animals.Lion;  // импортирование по одному классу за раз из пакета на один уровень глубже
import packaging.animals.Tiger;
import packaging.cars.deep2supercars.*; // импортирование всех классов сразу из пакета на 2 уровня глубже

public class Importing {
    Lion arslan = new Lion();
    Tiger tigrula = new Tiger();

    CarTypeOne miniCar = new CarTypeOne();
    CarTypeTwo superCar = new CarTypeTwo();
}
