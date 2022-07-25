import java.rmi.MarshalException;
import java.util.Arrays;

/** enum - ��� ����������� ��������� �����, ����������� ������������,
 *      1) ��� ����� ������������, ����� ���������� ����������� ��������� � ������������ ������ �������.
 *          ��������, ����� �������� �����, ������� ��������� ��� ������, �� �� ����� �������� � ��� �������
 *          ������, �� ����������� � ���� �������. (https://javarush.ru/groups/posts/1963-kak-ispoljhzovatjh-klass-enum)
 *         P.S. �� ���� enum ����� ��� �������� ������������� ����� ��������.
 *
 *      2) ������� ������������, � ������ ���������, ��������� ������ enum, � �� �������. � ��� ������� ������!
 *      � ������� ����������� ������� �, ��������, ���������� ������������ ����� �������� � ����� ����������� ��� � ���������.
 *      � ��� ���������� ����� ��� ����������� ����!
 *
 *      3) ������������ ������������ enum ����� ������ �� switch.
 *
 *      4) ���� enum � �����, �� �� ���� ������ �������������
 *
 * */

public class Enumirate {

    public static void main(String[] args) {
        // ��������� ������� enum
        Months month = Months.MARCH;

        System.out.println(month instanceof Months); // �������� �� ��, ��� Months.MARCH - ��� ������ ������ Months
        System.out.println(month.getClass()); // � ��� ������ ���������� ����� � ������� �������
        System.out.println(month.name()); // � ��� �� �������� ����������� ��� �������-���������

        switch (month){
            case APRIL: // ���������� ���������, ��� ���������
                System.out.println("������, ���� ������");
                break; // ����� ������ case �� �����������
            case JULY:
                System.out.println("�����, ����");
                break;
            default: // � ��� ���� ��� ���������
                System.out.println("������� ������ - "+month);
                break;
        }

        // ����������� ����� values() ���������� ������ ���� �������� ������������
        System.out.println(Arrays.toString(Months.values()));

        // ��������� ����������� ������ ��������� ordinal() - �� ������� ����������
        System.out.println(month.ordinal());

        // ������ ������ ��������� ������� enum � ��������������� ������
        Months newMonth = Months.valueOf("MAY");
        System.out.println(newMonth);
    }
}

/** �������� ������������ Object -> Enum -> Months */
enum Months{
    // ��� ��������� (�� �� ���� ������� ������ Months)
    JANUARY("������"), FEBRUARY("�������"), MARCH("����"), APRIL("������"), MAY("���"),
    JUNE("����"), JULY("����"), AUGUST("������"), SEPTEMBER("��������"),
    OCTOBER("�������"), NOVEMBER("������");
    private String translation; // ��� ������������� ����, ����������� � ������� �� 12 �������� ������ Months
    Months(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}