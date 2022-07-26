/** ���� ������� - ��� ����������� ������� ������, ��� �������� ������� ������� �������.
 *       ����� ������ ���������� ��� ���� ������� ���������, �������� ������ StackOverflow
 *
 *  ������������ ����� ���� ��� �����������, ��� � �� ����������� ������ */

public class Recursion {

    public int someNum;

    public static void main(String[] args) {
        Recursion recursion = new Recursion(100);
        System.out.println(fact(5));
        System.out.println();
        recursion.div();
    }

    private static int fact(int n){ // ����������� ������ �����
        if (n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

    Recursion(int n){
        this.someNum = n;
    }

    public void div(){  // ����������� ����� �������(��������)
        if (someNum == 1){
            return;
        }
        someNum = someNum / 2;
        System.out.println(someNum);
        div();
    }
}
