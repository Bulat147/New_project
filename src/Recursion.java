/** Стек вызовов - это специальная область памяти, где хранится порядок вызовов методов.
 *       Когда память выделенная под стек вызовов кончается, вылетает ошибка StackOverflow
 *
 *  Рекурсивными могут быть как статические, так и не статические методы */

public class Recursion {

    public int someNum;

    public static void main(String[] args) {
        Recursion recursion = new Recursion(100);
        System.out.println(fact(5));
        System.out.println();
        recursion.div();
    }

    private static int fact(int n){ // Рекурсивный статик метод
        if (n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

    Recursion(int n){
        this.someNum = n;
    }

    public void div(){  // Рекурсивный метод объекта(нестатик)
        if (someNum == 1){
            return;
        }
        someNum = someNum / 2;
        System.out.println(someNum);
        div();
    }
}
